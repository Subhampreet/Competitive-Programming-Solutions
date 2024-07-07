class Solution {
    public int majorityElement(int[] nums) {
        Integer candidate = null;
        int count = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            } else{
                count--;
            }
        }

        return candidate;
    }
}

// Boyer-Moore Voting Algorithm