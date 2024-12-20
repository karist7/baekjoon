#include <iostream> 
#include <cmath>

using namespace std;
 

int main(void)
{
        ios::sync_with_stdio(0);
        cin.tie(0);

        int n;
        int result;
        cin>>n;
        long long dp[100001];
        dp[1] = 2;
        
        for(int i=2;i<=n;i++){
                if(i%2==0){
                        dp[i] = dp[i-1];
                }
                else{
                        dp[i] = (dp[i-1]*2)%16769023;
                }
                
        }

        cout<<dp[n];
}
 