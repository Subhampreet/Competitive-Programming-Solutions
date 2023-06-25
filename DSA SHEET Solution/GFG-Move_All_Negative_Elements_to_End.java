// Problem URL - https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
// Solution URL - https://www.geeksforgeeks.org/move-ve-elements-end-order-extra-space-allowed/


class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        int temp[] = new int[n];
        int j = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i]>=0)
                temp[j++] = arr[i];
        }
        
        if (j == n || j == 0)
            return;
            
        for(int i = 0; i < n; i++){
            if(arr[i]<0)
                temp[j++] = arr[i];
        }
        
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
}