#include <iostream>

using namespace std;

int main()
{
   int i , n, a = 0, b = 0;
   
   cout<<"Enter a Number : ";
   cin>>n;
   
   for(i = 1; i <= n; i++){
       if(i % 2 != 0){
            if(i == 1)
                a = 0;
            else
                a = a + 2;
            cout<<a<<" ";
            
        }
        else{
            if(i == 2)
                b = 0;
            else
                b  = b + 1;
            cout<<b<<" ";
        }
   }
}