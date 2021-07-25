#include <iostream>
#include <algorithm>
#include <vector>
#include <cmath>
#define ll long long
using namespace std;
 
 
int main()
{	
	int t;
	cin >> t;
	while (t--) {
		int n;
		cin >> n;
		vector<ll>a(n);
		vector<ll>b(n);
		for (int i = 0; i < n; i++){
			cin >> a[i];
		}
		for (int i = 0; i < n; i++) {
			cin >> b[i];
		}
		int mina=*min_element(a.begin(),a.end()),minb=*min_element(b.begin(),b.end());
		ll res=0;
		for (int k = 0; k < n; k++) {
			res += max(a[k]-mina,b[k]-minb);
		}
		cout << res << endl;
	}
 
	return 0;
}
