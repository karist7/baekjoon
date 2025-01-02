#include <iostream>
#include <vector>

using namespace std;


int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int R,C,W;
    cin>>R>>C>>W;

    vector<vector<int>> dp =vector<vector<int>>(31);

    for(int i=1;i<R+W;i++){
        dp[i] = vector<int>(i,1);
        for(int j=1;j<i-1;j++){
            dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
        }
    }
    int d=C;
    int total=0;
    for(int i=R;i<R+W;i++){
        for(int j=C-1;j<d;j++){
            total += dp[i][j];
        }       
        d++;
    }
    cout<<total;
    return 0;
}
