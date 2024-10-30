#include <iostream>
#include<vector>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n;
    cin >> n;
    vector<int> vec;
    for (int i = 1;i * i <= n;i++) {
        vec.push_back(i * i);
    }
   
    vector<int> dp(n + 1, n + 1);
    dp[0] = 0;
    for (int i = 1;i <= n ;i++) {
        for (int nn : vec) {
            if (i - nn >= 0)
                dp[i] = min(dp[i], dp[i - nn] + 1);
            else
                break;
        }
    }
    cout << dp[n];

    return 0;
}
