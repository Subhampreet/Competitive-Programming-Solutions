// Problem URL - https://leetcode.com/problems/kth-largest-element-in-an-array/description/
// Problem Solution - https://www.youtube.com/watch?v=9s6ZcFZ_3ys&list=PLzffTJx5aHaRMfFodb4O5yyi6uSA4Q3E0&index=3

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}