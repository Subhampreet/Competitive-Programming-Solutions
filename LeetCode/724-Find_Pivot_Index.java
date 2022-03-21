// Solution : https://www.youtube.com/watch?v=0PiH6Beqif8

class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum = 0;
        for(int i =0; i < nums.length; i++){
            total_sum += nums[i];
        }
        int left_sum = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            if(i != 0 ) left_sum += nums[i-1];
            if(total_sum - left_sum - nums[i] == left_sum)
                return i;
            
        }
        return -1;
    }
}