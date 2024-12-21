#include <iostream>
#include <vector>
#include <cmath>
using namespace std;


int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    vector<double> dp(n + 1);
    
    for(int i=0;i<n;i++){
        cin >> dp[i];
        
    }
    double result = dp[0];
    double prev_max = dp[0];
    for(int i=1;i<n;i++){
       prev_max = max(dp[i],prev_max*dp[i]);
       result = max(result,prev_max);
    }
    cout<<fixed;
    cout.precision(3);
    cout<<result;
  
   
    return 0;
}
