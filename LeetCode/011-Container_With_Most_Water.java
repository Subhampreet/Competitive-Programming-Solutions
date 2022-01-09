class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int a_pointer = 0;
        int b_pointer = height.length - 1;
        while(a_pointer < b_pointer){
            if(height[a_pointer] < height[b_pointer]){
                max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer += 1;
            }
            else{
                max_area = Math.max(max_area, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer -= 1;
            }
        }
        return max_area;
    }
}