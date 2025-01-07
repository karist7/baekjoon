#include <iostream>
#include <vector>

using namespace std;
static int count=0;

int matrix_path_rec(int m[][16],int i, int j){
    if(i==0 || j==0){
        count++;
        return 0;
    }
    else{
        return (m[i][j] + (max(matrix_path_rec(m,i-1,j),matrix_path_rec(m,i,j-1))));
    }
}
int matrix_path(int m[][16], int n){
    return matrix_path_rec(m,n,n);
}
int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin>>n;

    int dp[16][16];
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            cin>>dp[i][j];
        }
    }

    matrix_path(dp,n);
    cout<<count<<" "<<n*n;
    return 0;
}
