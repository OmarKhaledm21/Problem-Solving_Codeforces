#include <iostream>  
using namespace std;
 
int main()
{
    int n,t;
    cin >>t;
    while (t--) {
		cin >> n;
 
		n =n/ 2;
		if (n & 1) 
		{
			cout << "NO" << endl;
			continue;
		}
		cout << "YES" << endl;
		for (int i = 1; i <= n; i++)
		{
			cout <<( i * 2) << " ";
		}
		for (int i = 1; i < n; i++)
		{
			cout << ((i * 2) - 1) << " ";
		}
		cout << ((3 * n) - 1) << endl;
        
    }
    return 0;
}
