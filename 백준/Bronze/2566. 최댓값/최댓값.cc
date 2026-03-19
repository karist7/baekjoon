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
    int maxVal = INT32_MIN;
    int row = 0;
    int col = 0;
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            int n;
            cin >> n;
            if (maxVal < n) {
                row = i;
                col = j;
                maxVal = n;
            }
        }
    }
    cout << maxVal << "\n";
    cout << row+1 << " " << col+1;
}
