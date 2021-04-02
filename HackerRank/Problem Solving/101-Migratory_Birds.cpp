#include <bits/stdc++.h>

using namespace std;




int main()
{
    int n, arr[100], x[5] = {0,0,0,0,0}, i;
    cin>>n;

    for(i = 0; i < n; i++){
        cin>>arr[i];
    }

    for(i = 0; i < n ; i++){
        int count = 0;
        int y = arr[i];
        for(int j = 0; j < n ; j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }
        x[y-1] = count;
    }

    int max = x[0], result = 0;

    for(i = 1; i<n ; i++){
        if (x[i]>=max){
            max = x[i];
        }
    }

    for(i = 0; i < n; i++){
        if(x[i] == max){
            result = i + 1;
            break;
        }
    }

    cout<<result;
}