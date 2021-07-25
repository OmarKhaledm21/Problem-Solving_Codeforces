#include <iostream>
#include <string>
#include <vector>
#include <map>
#include <algorithm>
 
using namespace std;
 
int main()
{
    string arr="qwertyuiopasdfghjkl;zxcvbnm,./";
    string arr_new, in;
    cin >> in;
    cin >> arr_new;
    if (in == "R") {
        for (int i = 0; i < arr_new.length()+1; i++)
        {
            for (int j = 0; j < 30; j++) {
                if (arr_new[i] == arr[j]) {
                    arr_new[i] = arr[j - 1];
                    break;
                }
            }
        }
    }else{
        for (int i = 0; i < arr_new.length()+1; i++)
        {
            for (int j = 0; j < 30; j++) {
                if (arr_new[i] == arr[j]) {
                    arr_new[i] = arr[j + 1];
                    break;
                }
            }
        }
    }
    cout << arr_new;
    return 0;
}
