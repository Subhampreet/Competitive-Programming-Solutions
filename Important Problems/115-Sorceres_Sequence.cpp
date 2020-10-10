#include <bits/stdc++.h> 

using namespace std; 
  

void printJuggler(int n) 
{ 
    int a = n; 
  
    
    cout << a << " "; 
  
    
    while (a != 1) 
    { 
        int b = 0; 
  
        
        if (a % 2 == 0) 
  
            
            b = floor(sqrt(a)); 
  
        else
  
            
            b = floor(sqrt(a) *  
                      sqrt(a) * sqrt(a)); 
  
        cout << b << " "; 
        a = b; 
    } 
    cout<<"\n";
} 
  
int main() 
{ 
    int T, n;
    cin >> T;
    while(T!=0){
        cin>>n;
        printJuggler(n); 
        T--;
    }
    
    return 0; 
} 