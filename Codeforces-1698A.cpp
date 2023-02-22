#include <iostream>
#include "math.h"
#include <vector>
#include <queue>
#include <set>
#include <map>

using namespace std;

class Solution
{
public:
    void XORMixup(vector<int> &arr, int n, int xr)
    {
        for (int i = 0; i < n; ++i)
        {
            if ((xr ^ arr[i]) == arr[i])
            {
                cout << arr[i] << "\n";
                return;
            }
        }
    }
};

int main()
{
    Solution s;
    int t;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        int n;
        cin >> n;
        int xr = 0;
        vector<int> arr(n);
        for (int j = 0; j < n; j++)
        {
            cin >> arr[j];
            xr ^= arr[j];
        }
        s.XORMixup(arr, n, xr);
    }
    return 0;
}
