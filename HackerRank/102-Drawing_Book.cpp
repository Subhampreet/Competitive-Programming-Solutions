#include <bits/stdc++.h>

using namespace std;


int main()
{
    int n, p, w1, w2;

    cin>>n;
    cin>>p;

    w1 = p/2;
    w2 = n/2 - p/2;

    if(w1 < w2)
        cout<<w1;
    else
        cout<<w2;

    return 0;
}