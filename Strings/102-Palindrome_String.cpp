#include <iostream>
#include<stdio.h>
#include<string.h>

using namespace std;

void isPalindrome(char str[]){
    
    int l = 0;
    int h = strlen(str) - 1;
    
    while(h > 1){
        if(str[l++] != str[h--])
        {
            cout<<str<<" is Not a Palindrome."<<"\n";
            return;
        }
        
    }
    cout<<str<<" is a Palindrome."<<"\n";
    
}

int main()
{
   isPalindrome("abba");
   isPalindrome("Subham");
   return 0;
}