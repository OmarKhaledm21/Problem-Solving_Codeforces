#include <iostream>
#include <deque>
#include <algorithm>
#include <cmath>
#define ll long long
using namespace std;
 
int main()
{
    ll n, x,d, sum = 0, dis = 0;
    char GC;
    cin >> n >> x;
    sum += x;
    for (int i = 0; i < n; i++) {
        cin >> GC >> d;
        if (GC == '+') {
            sum += d;
        }
        else {
            if (sum >= d) {
                sum -= d;
            }
            else {
                dis++;
            }
        }
    }
    cout << sum << " " << dis;
    return 0;
}
