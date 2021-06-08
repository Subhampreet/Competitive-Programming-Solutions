#include <iostream>

using namespace std;

int search(int arr[], int n, int x){
    int i = 0;
    for (i = 0; i < n; i++){
        if(arr[i] == x)
            return i;
    }
    return -1;
}

int main()
{
   int arr[] = {1,2,3,10,4,40};
   int x = 40;
   int n = sizeof(arr) / sizeof(arr[0]);
   int result = search(arr,n,x);
   
   (result == -1)? cout<<"Element Not Found" : cout<<"Element found at index "<<result;
   
   return 0;
}