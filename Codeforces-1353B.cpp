#include <iostream>
#include <algorithm>
#include <vector>
 
using namespace std;
 
int main()
{
    int n, k,t;
    cin >> t;
    while (t--)
    {
        int sum = 0;
        cin >> n >> k;
        vector<int>a(n);
        vector<int>b(n);
        sort(a.begin(), a.end());
        sort(b.rbegin(), b.rend());
        for (int m = 0; m < n; m++) {
            cin >> a[m];
        }
        for (int q = 0; q < n; q++) {
            cin >> b[q];
        }
        sort(a.begin(), a.end());
        sort(b.rbegin(), b.rend());
        for (int i = 0; i < n; i++) {
            if (i < k) { sum += max(a[i],b[i]); }
            else { sum += a[i]; }
        }
        cout << sum << endl;
        
    }
    return 0;
}
