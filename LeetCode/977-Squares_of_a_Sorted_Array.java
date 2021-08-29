class Solution {
    public int[] sortedSquares(int[] nums) {
        int N = nums.length;
        int positive_pointer = 0;
        
        while(positive_pointer < N && nums[positive_pointer] < 0){
            positive_pointer+=1;
        }
        
        int negative_pointer = positive_pointer - 1;
        
        int[] sorted_square = new int[N];
        int counter = 0;
        
        while(negative_pointer >= 0 && positive_pointer < N){
            if(nums[negative_pointer] * nums[negative_pointer] < nums[positive_pointer] *           nums[positive_pointer]){
                sorted_square[counter] = nums[negative_pointer] * nums[negative_pointer];
                negative_pointer -= 1;
            }
            else{
                sorted_square[counter] = nums[positive_pointer] * nums[positive_pointer];
                positive_pointer += 1;
            }
            
            counter+=1;
        }
        
        while(negative_pointer >= 0){
            sorted_square[counter] = nums[negative_pointer] * nums[negative_pointer];
            negative_pointer -= 1;
            counter+=1;
        }
        
        while(positive_pointer < N){
            sorted_square[counter] = nums[positive_pointer] * nums[positive_pointer];
            positive_pointer += 1;
            counter+=1;
        }
        
        return sorted_square;
    }
}