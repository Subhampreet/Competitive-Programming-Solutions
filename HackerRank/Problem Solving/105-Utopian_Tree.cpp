#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n, arr[n], x[n], i , j, m = 1;
    cin>>n;
    for(i = 0 ; i < n; i ++){
        cin>>arr[i];
    }

    for(i = 0 ; i < n; i ++){
        if(arr[i]==0){
            x[i] = 1;
        }
        else{
            m = 1;
            for(j = 1 ; j <= arr[i]; j++){
                if(j % 2 != 0){
                    m = m * 2;
                }
                else{
                    m = m + 1;
                }
            }
            x[i] = m;

        }

    }

    for(i = 0 ; i < n; i ++){
        cout<<x[i]<<"\n";
    }




    return 0;
}