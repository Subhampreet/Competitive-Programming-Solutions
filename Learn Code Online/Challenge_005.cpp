#include <iostream>

using namespace std;

int main()
{
   int A[] = {66,57,53,54,64,52,59}; 
   int n, i = 0, j = 0, temp;
   n = sizeof(A);
   for(i = 0; i < n; i++){
       for(j = 0; j < n-i-1; j++){
           if(A[j] > A[j+1]){
               temp = A[j];
               A[j] = A[j+1];
               A[j+1] = temp;
           }
       }
   }
   
   cout<<"Best Timing is : "<<A[1];
   // A[1] since it stores garbage value at A[0]
}