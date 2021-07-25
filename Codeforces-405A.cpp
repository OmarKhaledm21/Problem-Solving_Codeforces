#include <iostream>
#include <vector>
#include <algorithm>
#define ll long long
using namespace std;
 
int main()
{
    int h;
    cin >> h;
    vector<int>cubes(h);
    for (int i = 0; i < h; i++) {
        cin >> cubes[i];
    }
    sort(cubes.begin(), cubes.end());
    for (int i = 0; i < h; i++) { cout << cubes[i] << " "; }
    
 
 
    return 0;
}
