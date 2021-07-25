#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
 
 
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
 
	int n, maxd = 0, mind = 0;
	cin >> n;
	vector<int>city(n);
	
 
	for (int i = 0; i < n; i++) cin >> city[i];
 
 
	for (int i = 0; i < n; i++) {
		if (i == 0) {
			maxd =abs( city[n - 1] - city[i]);
			mind = abs(city[i + 1] - city[i]);
		}
		else if (i==(n-1)) {
			maxd = abs(city[n-1]-city[0]);
			mind = abs(city[n-1]-city[n-2]);
		}
		else {
			mind = min(abs(city[i+1]-city[i]),abs(city[i-1]-city[i]));
			maxd = max(abs(city[i]-city[0]), abs(city[n-1]-city[i]));
		}
		cout << mind << " " << maxd<<"\n";
	}
 
    
 
	return 0;
}
