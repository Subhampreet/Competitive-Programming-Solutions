class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        } while(fast != slow);
        
        fast = nums[0];
        
        while(slow != fast){
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }
}