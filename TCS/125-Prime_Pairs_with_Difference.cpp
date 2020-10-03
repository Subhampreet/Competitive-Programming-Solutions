// There is a range given n and m in which we have to find the count all the prime pairs whose difference is 6. We have to find how many sets are there within a given range.



// Output:

// Output consists of single line, print the count prime pairs in given range. Else print"No Prime Pairs".



// Constraints:

// 2<=n<=1000

// n<=m<=2000



// Sample Input:

// 4

// 30



// Output:

// 6



// Explanation:

// (5, 11) (7, 13) (11, 17) (13, 19) (17, 23) (23, 29) . we have 6 prime pairs.



#include <bits/stdc++.h>

using namespace std;

void count_prime(int l, int r)
{
    int count = 0;
    bool prime[r+1];
    memset(prime, true, sizeof(prime));
    
    for(int p = 2; p*p <= r; p++){
        if(prime[p] == true){
            for(int i = p*2; i <= r; i+=p)
                prime[i] = false;
        }
    }
    
    for (int i = l; i <= r - 6; i++)  
        if (prime[i] && prime[i + 6]) 
            count++; 
            
    if(count>0)
        cout<<count;
    else
        cout<<"No Prime Pairs";
    
    
}

int main()
{   
    int n,m;
    cin>>n>>m;
    count_prime(n, m); 
    return 0; 
}