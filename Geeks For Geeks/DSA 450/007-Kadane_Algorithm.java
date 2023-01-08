








































Refresh

Time (IST)	Status	Lang	Test Cases	Code
2022-12-29 21:58:12	Correct	java	10133 / 10133	View
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
     
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
        
    }
    
}