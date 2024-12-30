#include <iostream>
#include <vector>

using namespace std;

string fibonacci(string a, string b){
    while(a.length()>b.length()) b = "0"+b;


    int carry=0, sum=0;
    string result = "";
    
    for(int i=a.length()-1;i>=0;i--){
        sum = (a[i]-'0') + (b[i]-'0') + carry;
        
        carry = sum/10;
        result = (char)((sum%10)+'0') + result;
       
    }
    
    if(carry>0) result = (char)(carry+'0') + result;
 
    return result;
}


int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    
    vector<string> dp(117);
    dp[0] = "0";
    dp[1] = "1";
    dp[2] = "1";
    dp[3] = "1";    

    for(int i=4;i<117;i++){
        dp[i] = fibonacci(dp[i-1],dp[i-3]);
  
    }

        
    cout<<dp[n]<<"\n";
    
    
  
   
    return 0;
}
