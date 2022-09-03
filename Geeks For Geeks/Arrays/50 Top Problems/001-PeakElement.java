// GFG Problem Link : https://practice.geeksforgeeks.org/problems/peak-element/1
// GFG Article : https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
// Time Complexity : O(Logn) (Divide and Conquer Method) 
// YouTube Reference : https://www.youtube.com/watch?v=zNEn4n0IdPY


class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int low = 0;
       int high = n-1;
       
       while(low <= high){
           
            int mid = (high + low)/2;

           
            if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            {
                return mid;
            }
                
            else if (arr[mid] < arr[mid + 1]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
       }
       return -1;
    }
}