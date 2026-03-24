#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <stack>
#include <queue>


using namespace std;


int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cin >> n;
    int sol = 0;
    for (int i = 0; i < n; i++) {
        string str;
        cin >> str;
        int idx = 0;
        int prev = 0;
        bool arr[26] = { false };
        bool isGroup = true;
        for (int j = 0; j < str.length(); j++) {
            idx = str[j] - 'a';
            if (arr[idx] == false) {
                arr[idx] = true;
            }
            else {

                if (prev != idx) {
                    isGroup = false;
                    break;
                }
            }
            prev = idx;

        }
        if (isGroup) sol++;

    }
    cout << sol << "\n";
}
