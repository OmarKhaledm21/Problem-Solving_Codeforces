#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
 
 
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
 
	size_t l = 0;
	string a, b;
	cin >> a >> b;
	l = max(a.length(), b.length());
	if (a == b) {
		cout << "-1";
	}
	else {
		cout << l;
	}
	
 
 
	return 0;
}
