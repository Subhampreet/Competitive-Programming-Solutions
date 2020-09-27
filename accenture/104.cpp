#include <iostream>

using namespace std;

int main()
{
   int n, sum, prod;
   cin>>n;
   
   for(int i = 1; i<=10; i++){
       prod = n * i;
       cout <<"\n"<< prod;
       sum = sum + prod;
   }
   
   cout<<"\n"<<sum;
}