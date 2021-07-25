#include <iostream>
#include <deque>
#include <algorithm>
#include <cmath>
#define ll long long
using namespace std;
 
int main()
{
    int n, t, k, d;
    cin >> n >> t >> k >> d;
    int _time = ceil((double)d/t);
    n = n - (_time * k);
    if (n > 0) {
        if (d % t != 0)
            cout << "YES" << endl;
        else {
            if (n > k) cout << "YES" << endl;
            else cout << "NO" << endl;
        }
    }
    else {
        cout << "NO" << endl;
    }
    return 0;
}
