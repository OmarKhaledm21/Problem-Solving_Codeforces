#include <iostream>
#include <string>
#include <vector>
#include <map>
#include <algorithm>
 
using namespace std;
 
int main()
{
    int n,sum=0,suml=0,j=0;
    cin >> n;
    vector<int>v(n);
    for (int i = 0; i < n; i++) {
        cin >> v[i];
        sum += v[i];
    }
    sort(v.begin(), v.end());
    if (v.size() == 2) {
        if (v[0] == v[1]) {
            cout << "2";
        }
        else {
            cout << "1";
        }
    }
    else {
        for (int i = n - 1; i >= 0; i--) {
 
            if (suml <= (sum / 2)) {
                suml += v[i];
                j++;
            }
        }
        cout << j << endl;
    }
 
 
    return 0;
}
