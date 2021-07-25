#include <iostream>
#include <deque>
#include <algorithm>
#define ll long long
using namespace std;
 
int main()
{
    int n,m,x,y;
    cin >> n;
    deque<int>a(n+1);
    for (int i = 1; i <= n; i++) { cin >> a[i]; }
    cin >> m;
    for (int i = 1; i <= m; i++) {
        cin >> x >> y;
        a[x - 1] += y - 1;
        a[x + 1] += a[x] - y;
        a[x] = 0;
    }
    for (int i = 1; i <= n; i++) { cout << a[i]<<endl; }
    return 0;
}
