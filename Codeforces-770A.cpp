#include <iostream>
#include <vector>
using namespace std;
 
 
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	int n, k,temp=0;
	cin >> n >> k;
	temp = k;
	string s="a";
	for (int i = 0; i < n-1; i++) {
		if (k == 0) {
			k =temp ;
			s += 97 + (k - 1);
			k--;
		}
		else {
			s += 97 + (k - 1);
			k--;
		}
	}
	cout << s;
 
	return 0;
}
