class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}



// Explanation:
// Initialization: A pointer k is initialized to 0. This pointer represents the index where the next non-val element should be placed.

// Iteration: The loop iterates through each element in the nums array.

// If the current element nums[i] is not equal to val, it is placed at the k-th position, and k is incremented.
// If the current element is equal to val, the loop simply continues without changing k.
// Return: After the loop completes, k contains the number of elements in nums that are not equal to val.

// Output: The main method demonstrates how the function works by creating a test array, calling the function, and printing the first k elements of the modified array.

// This approach ensures that the elements in nums which are not equal to val are moved to the front of the array and the number of such elements is returned.