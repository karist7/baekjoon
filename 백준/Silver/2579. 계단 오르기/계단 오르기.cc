#include <iostream>
#include <vector>

using namespace std;
#define MAX 301

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int step1,step2;

    int n;
    cin >> n;
    int arr[MAX] = { 0, };
    int dp[MAX] = { 0, };

    for (int i = 1;i <= n;i++) {
        int d;
        cin >> d;
        arr[i] = d;
    }
    
    dp[1] = arr[1];
    dp[2] =  arr[1] + arr[2];

    step1 = arr[3] + arr[2];
    step2 = arr[3] + arr[1];
    dp[3] = max(step1, step2);
    for (int i = 4;i <= n;i++) {
        step1 = arr[i] + dp[i - 2];
        step2 = arr[i] + dp[i - 3] + arr[i - 1];
        dp[i] = max(step1, step2);
    }
    cout << dp[n] << '\n';
    

    return 0;
}
