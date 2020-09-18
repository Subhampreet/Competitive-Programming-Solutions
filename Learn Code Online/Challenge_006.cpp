#include <iostream>

using namespace std;

int multiply(int x, int y){
    if(y == 0)
        return 0;
    if(y > 0){
        return (x + multiply(x,y-1));
    }
    return -1;
}

int main()
{
   int people = 1200;
   int days = 200;
   int N = multiply(people,days);
   cout<<N;
}