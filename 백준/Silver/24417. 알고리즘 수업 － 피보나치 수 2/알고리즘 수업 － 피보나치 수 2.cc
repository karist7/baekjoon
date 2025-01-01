#include <iostream>
#include <vector>

using namespace std;


int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    
    int prev_1 = 1;
    int prev_2 = 1;
    int result=0;
    for(int i=3;i<=n;i++){
        result = (prev_1 + prev_2)%1000000007;
        prev_1 = prev_2;
        prev_2 = result;
        
    }
    cout<<result<<" "<<(n-2)%1000000007;
    return 0;
}
