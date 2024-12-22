#include <iostream>
#include <vector>

using namespace std;

string fibonacci(string a, string b, string c, string d){
    while(a.length()>b.length()) b = "0"+b;
    while(a.length()>c.length()) c = "0"+c;
    while(a.length()>d.length()) d = "0"+d;

    int carry=0, sum=0;
    string result = "";
    
    for(int i=a.length()-1;i>=0;i--){
        sum = (a[i]-'0') + (b[i]-'0') + (c[i]-'0') + (d[i]-'0') + carry;
        
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
    int d;
    vector<string> dp(68);
    dp[0] = "1";
    dp[1] = "1";
    dp[2] = "2";
    dp[3] = "4";    

    for(int i=4;i<68;i++){
        dp[i] = fibonacci(dp[i-1],dp[i-2],dp[i-3],dp[i-4]);
  
    }

    for(int i=0;i<n;i++){
        cin >> d;
        cout<<dp[d]<<"\n";
    }
    
  
   
    return 0;
}
