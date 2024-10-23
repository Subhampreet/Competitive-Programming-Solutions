class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        if (n == 0) return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];  // Update leftMax
                } else {
                    trappedWater += leftMax - height[left];  // Water can be trapped
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];  // Update rightMax
                } else {
                    trappedWater += rightMax - height[right];  // Water can be trapped
                }
                right--;
            }
        }

        return trappedWater;
    }
};
