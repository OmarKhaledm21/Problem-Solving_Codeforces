#include <iostream>
#include <string>
#include <vector>
#include <map>
#include <algorithm>
 
using namespace std;
 
int main()
{
	int n, pcount = 0, primes[5000];
	bool prime;
	cin >> n;
 
	for (int i = 1; i < 4000; i++)
	{
		prime = true;
		if (i == 0 || i == 1)
		{
			prime = false;
		}
		else
		{
			for (int j = 2; j <= i / 2; j++)
			{
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
		}
		if (prime)
		{
			primes[pcount] = i;
			pcount++;
		}
	}
 
	
	int c = 0;
	pcount = 0;
	for (int i = 6; i <= n; i++) {
		pcount = 0;
		for (int j = 0; primes[j] <= i; j++) {
			if (i % primes[j] == 0) {
				pcount++;
			}
			
		}
		if (pcount == 2) {
			c++;
		}
	}
	cout << c << endl;
 
 
    return 0;
}
