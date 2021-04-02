#include <bits/stdc++.h>
#include <cmath>

using namespace std;



int main()
{
    int n,  i , j, arr[100][3] ;

    cin>> n;

    for(i = 0 ; i < n ; i++){
        for(j = 0 ; j < 3 ; j++){
            cin>>arr[i][j];
        }
    }

    i = 0;
    while(i<n){
        int diff1 = 0, diff2 = 0;

    
        
        diff1 = abs(arr[i][0] - arr[i][2]);
        diff2 = abs(arr[i][1] - arr[i][2]);

        if(diff1 < diff2){
            cout<<"Cat A"<<"\n";
        }
        else if(diff1 > diff2){
            cout<<"Cat B"<<"\n";
        }
        else{
            cout<<"Mouse C";
        }

        i++;
    }
        
    return 0;
}
