#include <iostream>
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    int a[n];
    long long ans = 0, zero = 0;
    int flag = 0;
    for (int i = 0; i < n; ++i) {
        cin>> a[i];
        if(a[i] != 0){
          flag = 1;  
        } 
        if(flag && i != n-1){
            ans += a[i] + (a[i] == 0);
        }
    }
    cout << ans;
}
int main(){
    int t = 1;
    cin >> t;
    while (t--){
        solve();
        cout << endl;
    }
}