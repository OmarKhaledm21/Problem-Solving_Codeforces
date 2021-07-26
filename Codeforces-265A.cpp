#include <iostream>
#include <math.h>
#include <vector>
#include <algorithm>
#define ll long long
using namespace std;


int main() {

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string s, t;
    int j = 0;
    cin >> s >> t;
    for (int i = 0; i < t.size(); i++) {
        if (t[i] == s[j]) {
            j++;
        }
    }
    cout << j+1;

    return 0;
}