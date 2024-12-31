#include <iostream>
#include <vector>

using namespace std;


int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    vector<long long> dp(n+1);
    dp[0] = 1;
    dp[1] = 1;
    dp[2] = 2;
    for(int i=3;i<=n;i++){
        for(int j=0;j<i;j++){
            dp[i] += dp[j]*dp[i-j-1];  
        }
    }
    cout<<dp[n];
    return 0;
}
