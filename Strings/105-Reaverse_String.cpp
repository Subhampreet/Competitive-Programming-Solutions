#include<bits/stdc++.h> 


using namespace std;

void reverse(string str){
    if(str.size() == 0){
        return;
    }
    reverse(str.substr(1));
    cout<< str[0];
}



int main()
{
   string a = "Subhampreet Mohanty";
   reverse(a);
   return 0;
}