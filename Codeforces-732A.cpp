#include <iostream>
#include <math.h>
#include <vector>
#include <algorithm>
#define ll long long
using namespace std;


int main() {
    int k, r, res=0,n=0;
    cin >> k >> r;
    while (true) {
        n++;
        res = n * k;
        if (res % 10 == 0 || res % 10 == r) {
            break;
        }
    }
    cout << n;

    return 0;
}