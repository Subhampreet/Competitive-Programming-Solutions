#include <iostream>

using namespace std;

int search(int arr[], int l, int r, int x){
    
    if(r < l)
        return -1;
    if(arr[l] == x)
        return l;
    if(arr[r] == x)
        return r;
    return search(arr, l+1, r-1, x);
}

int main()
{
   int arr[] = {1,2,3,4,10,40,7,6,22};
   int x = 6;
   int n = sizeof(arr) / sizeof(arr[0]);
   int result = search(arr,0,n-1,x);
   
   (result == -1)? cout<<"Element Not Found" : cout<<"Element found at index "<<result;
   
   return 0;
}