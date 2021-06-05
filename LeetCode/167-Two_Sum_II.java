class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int a_pointer = 0;
        int b_pointer = numbers.length -1;
        
        while(a_pointer < b_pointer){
            int sum = numbers[a_pointer] + numbers[b_pointer];
            
            if(sum > target){
                b_pointer -= 1;
            }
            else if(sum < target){
                a_pointer += 1;
            }
            else
                return new int[] {a_pointer+1, b_pointer+1};
        }
        
        return new int[] {a_pointer+1, b_pointer+1};
    }
}