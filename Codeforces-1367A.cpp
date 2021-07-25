#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>
#define ll long long
using namespace std;
 
 
 
int main() 
{
	int t;
	cin >> t;
	while (t--) {
		int n, counter1 = 0, counter2 = 0;
		cin >> n;
		vector<int>arr(n);
		for (int i = 0; i < n; i++) {
			cin >> arr[i];
		}
		for (int i = 0; i < n; i++) {
			if (i % 2 != arr[i] % 2) {
				if (i % 2 == 0) { counter1++; }
				else { counter2++; }
			}
		}
		if (counter1 != counter2) { cout << -1 << endl; }
		else { cout << counter1 << endl; }
	}
	return 0;
}
