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
    int n, m;
    cin >> n>>m;
    vector<int> arr;
    for (int i = 0; i < n; i++) {
        int k;
        cin >> k;
        arr.push_back(k);
    }
    int maxVal = 0;
    int subVal;

    for (int i = 0; i < arr.size() - 2; i++) {
        for (int j = i + 1; j < arr.size() - 1; j++) {
            for (int l = j + 1; l < arr.size(); l++) {
                subVal = arr[i] + arr[j] + arr[l];
                if (maxVal < subVal && subVal <= m) maxVal = subVal;
            }
        }
    }
    cout << maxVal;
    
}
