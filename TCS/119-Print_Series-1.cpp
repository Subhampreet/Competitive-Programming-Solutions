#include <iostream>

using namespace std;

int main()
{
    int  i, n, a, b;
    cout << "Enter a Number : ";
    cin>>n;
    
    for(i = 1 ; i <= n ; i++){
        if( i % 2 != 0){
            if( i == 1)
            a = 1;
            else
            a = a * 2;
            cout<<a<<" ";
        }
        else{
            if(i == 2)
            b = 1;
            else
            b = b * 3;
            cout<<b<<" ";
        }
    }
    
    
}