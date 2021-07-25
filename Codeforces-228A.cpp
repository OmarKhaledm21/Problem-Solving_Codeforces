#include <iostream>
#include <math.h>
#include <vector>
#include <algorithm>
#define ll long long
using namespace std;


int main() {

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int s[4],sum=0;
    for (int i = 0; i < 4; i++) {
        cin >> s[i];
    }
    sort(s, s + 4);
    for (int i = 0; i < 3; i++) {
        if (s[i] == s[i + 1])
            sum++;
    }
    cout << sum;

    return 0;
}