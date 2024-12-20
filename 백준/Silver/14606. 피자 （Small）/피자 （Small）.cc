#include <iostream> 


using namespace std;
 
int main(void)
{
        ios::sync_with_stdio(0);
        cin.tie(0);
        int n;
        cin>>n;
        int dp[11];

        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
                dp[i] = dp[i-1]+i;
        }
        cout<<dp[n-1];
 
        return 0;
}
 