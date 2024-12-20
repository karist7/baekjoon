#include <iostream>
#include <vector>

using namespace std;


int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    vector<int> dp(n + 1);
    int result=0;
    int rmax=0;

    for(int i=0;i<n;i++){
        cin >> dp[i];
    }
    int c=0;
    for(int i=0;i<n-1;i++){
        if(dp[i]<=dp[i+1]){
            c++;
        }
        else{ 
            c=0;
        }
        result = max(c,result);
    }
    c=0;
    for(int i=0;i<n-1;i++){
        if(dp[i]>=dp[i+1]){
            c++;
        }
        else{
            c=0;
        }
        result = max(c,result);
    }
    cout <<result+1 << "\n";

    return 0;
}
