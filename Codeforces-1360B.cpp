#include <iostream>
#include <algorithm>
#include <vector>
#define ll long long
using namespace std;
 
 
int main()
{	
	int t;
	cin >> t;
	while (t--)
	{
		int n;
		cin >> n;
		vector<int>teams(n);
		for (int i = 0; i < n; i++) {
			cin >> teams[i];
		}
		sort(teams.begin(), teams.end());
		int res = teams[n - 1] - teams[0];
 
		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				res = min(res, teams[k] - teams[j]);
			}
		}
		cout << res << endl;
	}
	
 
	return 0;
}
