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
    char arr[5][15] = { NULL };
    for (int i = 0; i < 5; i++) {
        string str;
        cin >> str;
        for (int j = 0; j < str.length(); j++) {
            arr[i][j] = str[j];
        }
    }
    for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 5; j++) {
            if(arr[j][i]!=NULL) cout << arr[j][i];
        }
    }
}
