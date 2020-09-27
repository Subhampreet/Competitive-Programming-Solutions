#include <iostream>
using namespace std;
int reverse(int);
int main()
{
    int i, f, l;
    cout << "enter the starting \n", f;
    cin >> f;
    cout << "enter the ending\n", l;
    cin >> l;
    for (i = f; i <= l; i++)
    {
        if (i == reverse(i))
            cout << " " << i;
    }
    return 0;
}
int reverse(int a)
{
    int n = 0, d = 0, rev = 0;
    n = a;
    while (n != 0)
    {
        d = n % 10;
        rev = rev * 10 + d;
        n = n / 10;
    }
    return rev;
}