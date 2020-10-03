// Write a program to find the count of numbers which consists of unique digits.

// Input:

// Input consist of two Integer lower and upper value of an range


// Output:

// Output consists of single line, print the count of unique digits in given range. Else Print"No Unique Number"


#include <iostream>

using namespace std;

void printUnique(int l, int r)
{
    int count;
    
    for(int i = l; i <= r; i++){
        int num = i;
        bool visited[10] = {false};
        
        while(num)
        {
            if(visited[num % 10])
                break;
            
            visited[num % 10] = true;
            
            num = num / 10;
        }
        
        if(num == 0)
            count++;
    }
    
    if(count > 0)
        cout<<count;
    else
        cout<<"No Unique Number";
}

int main()
{   
    int l, r;
    cin >> l;
    cin >> r;
    printUnique(l, r);
    return 0;
}