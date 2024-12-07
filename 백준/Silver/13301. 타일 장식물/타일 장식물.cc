#include <iostream>
#include <vector>
#include <string>

using namespace std;

string fibonacci(string a, string b) {
    string result = "";
    int sum=0,carry = 0;

    while (a.length() > b.length()) {
        b = '0' + b;
    }
    for (int i = a.length() - 1;i >= 0;i--) {
        sum = (a[i] - '0') + (b[i] - '0') + carry;
        carry = sum / 10;
        result = char(sum%10 + '0') + result;
    }
    if (carry > 0)result = '1' + result;
    return result;
}
string mul(string c) {
    string result = "";
    int total = 0, carry = 0;
    for (int i = c.length() - 1;i >= 0;i--) {
        total = ((c[i] - '0') * 2) + carry;
        carry = total / 10;
        result = char(total % 10 + '0') + result;
    }
    if (carry > 0)result = '1' + result;
    return result;
}
int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    string fibo[81];
    fibo[0] = "0";
    fibo[1] = "1";
    for (int i = 2;i <= n;i++) {
        fibo[i] = fibonacci(fibo[i - 1], fibo[i - 2]);
    }
    
    string plus = fibonacci(fibonacci(fibo[n], fibo[n - 1]),fibo[n] );
    
    string result = mul(plus);
    cout << result;
    return 0;
}
