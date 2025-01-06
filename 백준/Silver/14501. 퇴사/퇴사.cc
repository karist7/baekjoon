#include <iostream>
#include <vector>

using namespace std;


int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin>>n;

    vector<int> T = vector<int>(n);
    vector<int> P = vector<int>(n);
    vector<int> dp = vector<int>(n+1);

    for(int i=0;i<n;i++){
        cin>>T[i]>>P[i];
    }
    int maxValue = 0;
    for(int i=0;i<=n;i++){    
        dp[i] = max(maxValue,dp[i]);
        if(i+T[i]<=n){
            dp[i+T[i]] = max(dp[i+T[i]],P[i] + dp[i]);
        }
        maxValue = max(dp[i],maxValue);    
    }
    cout<<maxValue<<"\n";
    return 0;
}
