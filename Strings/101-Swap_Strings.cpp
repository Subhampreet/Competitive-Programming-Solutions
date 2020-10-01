#include <iostream>
#include<stdio.h>

using namespace std;

void swap1(char **str1_ptr, char **str2_ptr){
    char *temp = *str1_ptr;
    *str1_ptr = *str2_ptr;
    *str2_ptr = temp;
}

int main()
{
   char *str1 = "Subhampreet";
   char *str2 = "Mohanty";
   
   swap1(&str1, &str2);
   
   cout<<str1<<" "<<str2;
   return 0;
}