// Given an unsorted array of nonnegative integers, find a continuous subarray which adds to a given number.


#include <bits/stdc++.h> 
using namespace std; 
  
/* Returns true if the there is a subarray  
of arr[] with sum equal to 'sum' otherwise  
returns false. Also, prints the result */
int subArraySum(int arr[], int n, int sum) 
{ 
    int curr_sum, i, j; 
  
    // Pick a starting point 
    for (i = 0; i < n; i++) { 
        curr_sum = arr[i]; 
  
        // try all subarrays starting with 'i' 
        for (j = i + 1; j <= n; j++) { 
            if (curr_sum == sum) { 
                cout << "Sum found between indexes "
                     << i << " and " << j - 1; 
                return 1; 
            } 
            if (curr_sum > sum || j == n) 
                break; 
            curr_sum = curr_sum + arr[j]; 
        } 
    } 
  
    cout << "No subarray found"; 
    return 0; 
} 
  
// Driver Code 
int main() 
{ 
    int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 }; 
    int n = sizeof(arr) / sizeof(arr[0]); 
    int sum = 23; 
    subArraySum(arr, n, sum); 
    return 0; 
} 