#include <iostream>
#include <vector>

using namespace std;


int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    
    for(int i=0;i<n;i++){
        int d;
        cin>>d;
        vector<int> dp(d);
        for(int j=0;j<d;j++){
            cin>>dp[j];
        }
        int prev_max=dp[0];
        int maxN=dp[0];
        for(int j=1;j<d;j++){
            prev_max = max(prev_max+dp[j],dp[j]);
            maxN = max(maxN,prev_max);
        }
        cout<<maxN<<"\n";
    }
    return 0;
}
