#include <iostream>
#include <vector>

using namespace std;


int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin>>n;

    vector<int> dp = vector<int>(n);
    vector<int> answer = vector<int>(n);
    for(int i=0;i<n;i++){
        cin>>dp[i];
    }

    int minValue = 1000000001;
    int result = 0;

    for(int i=0;i<n;i++){
        if(minValue > dp[i]){
            minValue = dp[i];
        }
        int d = dp[i] - minValue;
        if(d>result){
            result=d;
        }
        answer[i] = result;
    }
    for(int i=0;i<n;i++){
        cout<<answer[i]<<" ";
    }
    return 0;
}
