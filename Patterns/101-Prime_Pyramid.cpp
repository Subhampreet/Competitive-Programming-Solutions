// 1
// 2	3
// 5	7	11
// 13	17	19	23
// 29	31	37	41	43





#include <iostream>

using namespace std;

int prime(int x);

int main()
{
    int i, j, n=2;
    cout<<"\t"<<"1";
    for(i=1; i<5; i++){
        
        
        cout<<"\n";
        for(j=0;j<=i;j++)
        {
            while(!prime(n)==true){
                n++;
            }
            cout<<"\t"<<n++;
        }
            
        
        
    }
}


int prime(int n1)
{
    int i, flag=1;
    for(i=2; i<n1; i++){
        if(n1%i!=0)
        flag=1;
        else{
            flag=0;
            break;
        }
    }
    
    if(flag==1 || n1==2){
        return 1;
    }
    else
        return 0;
}