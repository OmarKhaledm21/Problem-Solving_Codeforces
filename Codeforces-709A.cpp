#include <iostream>
#include <deque>
#include <algorithm>
#define ll long long
using namespace std;
 
int main()
{
    int n,b,d,sum=0,res=0;
    cin >> n>>b>>d;
    for (int i = 0; i < n; i++) { 
        int x;
        cin >> x;
        if (x <= b) {
            sum += x;
        }
        if (sum > d) {
            res++;
            sum =0;
        }
    }
    cout << res;
    return 0;
}
