#include <iostream>
#include <math.h>
using namespace std;


int main() {
    int n,res=0;
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            cin >> n;
            if (n == 1) {
                res += abs(2 - i);
                res += abs(2 - j);
                break;
            }
        }
        if (n == 1) {
            break;
        }
    }
    cout << res;
    return 0;
}
