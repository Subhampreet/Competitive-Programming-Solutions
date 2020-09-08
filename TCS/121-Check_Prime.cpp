#include <iostream>

using namespace std;


int main()
{
    int i, n;
    bool isPrime = true;
    
    cout<< "Enter a Positive Number :";
    cin>>n;
    
    if(n == 0 || n ==1){
        isPrime = false;
    }
    else{
        for(i = 2; i <= n/2 ; ++i){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
    }
    
    if(isPrime)
        cout<<"\n"<<n<<" is a Prime Number";
    else
        cout<<"\n"<<n<<" is not a prime Number";
        
    return 0;
}