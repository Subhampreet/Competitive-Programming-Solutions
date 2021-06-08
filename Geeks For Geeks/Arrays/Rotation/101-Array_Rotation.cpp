#include <iostream>

using namespace std;

void leftRotateOne(int arr[], int n){
    int temp = arr[0], i;
    
    for(i=0;i<n-1;i++){
        arr[i] = arr[i+1];
    }
    arr[i] = temp;
}

void leftRotate(int arr[], int n, int d){
    for(int i = 0; i < d; i++){
        leftRotateOne(arr, n);
    }
}


void printArray(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
        cout << arr[i] << " "; 
} 


int main()
{
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
    int n = sizeof(arr) / sizeof(arr[0]); 
  
    // Function calling 
    leftRotate(arr, n, 2); 
    printArray(arr, n);
   
   
   return 0;
}