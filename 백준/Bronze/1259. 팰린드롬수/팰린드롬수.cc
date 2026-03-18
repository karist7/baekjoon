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
    string str;

    while (1) {
        bool check = false;
        getline(cin, str);
        if (str.compare("0") == 0) break;
        int l = str.length();
        for (int i = 0; i < l / 2; i++) {
            if (str[i] != str[l - i - 1]) {
                check = true;
                break;
            }
        }
        if (check) cout << "no\n";
        else cout << "yes\n";
    }
}
