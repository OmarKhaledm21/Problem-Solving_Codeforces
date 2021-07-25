#include <iostream>
#include <vector>
#include <algorithm>
#define ll long long
 
using namespace std;
 
int main()
{
    int t;
    cin >> t;
    
    while (t--) {
        int num;
        cin >> num;
        vector<int>per(num * 2);
        vector<int>per2(num);
        for (auto& iter : per) { cin >> iter; }
        vector<int>res;
        for (int i = 0; i < num * 2; i++) {
            if (!per2[per[i] - 1]) {
                per2[per[i] - 1] = true;
                res.push_back(per[i]);
            }
        }
        for (auto& it : res) { cout << it << " "; }
        cout << endl;
    }
 
 
    return 0;
}
