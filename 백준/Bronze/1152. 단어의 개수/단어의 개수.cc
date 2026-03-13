#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    string str;
    getline(cin, str);

    int sol = 0;

    for (int i = 0; i < str.length(); i++) {
        if (str[i] != ' ' && (i == 0 || str[i - 1] == ' ')) {
            sol++;
        }
    }

    cout << sol;
}