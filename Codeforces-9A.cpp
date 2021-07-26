#include <iostream>
#include <math.h>
#include <vector>
#include <algorithm>
#define ll long long
using namespace std;


int main() {

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

	int Y, W;
	cin >> Y >> W;
	int c = max(Y, W);
	int l = 7 - c;
	string probARRAY[7] = { "0/1","1/6","1/3","1/2","2/3","5/6","1/1" };
	cout << probARRAY[l];

    return 0;
}