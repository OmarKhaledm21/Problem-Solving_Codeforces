#include <iostream>
#include <vector>
#define ll long long
using namespace std;
 
int GCD(int x, int y)
{
    return (x == 0) ? y : GCD(y % x, x);
}
 
int main()
{
    int a, b, n;
    cin >> a >> b >> n;
    while (true)
    {
        n -= GCD(a, n);
        if (n == 0)
        {
            cout << 0 << endl;
            break;
        }
        n -= GCD(b, n);
        if (n == 0)
        {
            cout << 1 << endl;
            break;
        }
    }
    return 0;
}
