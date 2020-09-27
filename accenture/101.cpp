// def differenceofSum(n. m)

// The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.


#include <iostream>

using namespace std;

int main()
{
   int n, m, sum_div = 0, sum = 0, diff;
   
   cin>>n;
   cin>>m;
   
   for(int i=0; i<=m; i++){
       if(i%n == 0){
           sum_div = sum_div + i;
       }
       else{
           sum = sum + i;
       }
   }
   
   diff = sum - sum_div;
   
   cout<<diff;
   
   return 0;
}