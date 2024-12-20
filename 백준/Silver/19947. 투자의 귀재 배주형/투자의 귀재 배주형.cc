#include <iostream> 


using namespace std;
 
int main(void)
{
        ios::sync_with_stdio(0);
        cin.tie(0);
        int H,Y;
        cin >> H >> Y;
        int dp[11];
        dp[0] = H;
        
        for(int i=1;i<=Y;i++){

                dp[i] =  dp[i-1] + (dp[i-1]*0.05); 
                if(i>=3){
                        dp[i] = max((double)dp[i],(dp[i-3]+(dp[i-3]*0.2)));
                }
                if(i>=5){
                        dp[i] = max((double)dp[i],dp[i-5]+(dp[i-5]*0.35));                      
                }              
        }
        cout<<dp[Y];
        return 0;
}
 