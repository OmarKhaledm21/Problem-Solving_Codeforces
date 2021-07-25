#include <iostream>
#include <cstring>
#include <vector>
#include <algorithm>
#include <iomanip>
#define ll long long
using namespace std;
 
int main() 
{
    int num;
    cin >> num;
    vector<ll>vec(num);
    for (int i = 0; i < num; i++) { cin >> vec[i]; }
   
    if (num > 2) {
        sort(vec.begin(), vec.end());
        int min = vec[0], max = vec[num - 1],res=0;
        for (int i = 0; i < vec.size(); i++) {
            if (vec[i] > min && vec[i] < max) { res++; }
        }
        cout << res;
    }
    else {
        cout << "0";
    }
 
 
    return 0;
}
