#include <iostream>
#include <vector>
#include <string>

using namespace std;

#define INF 10001

string fibonacci(string a, string b) {
    int len=0;
    string result = "";
    int carry = 0, sum = 0;
    if (a.length() > b.length()) {
        len = a.length() - b.length();
    }
    for (int i = 0;i < len;i++) {
        b = '0' + b;
    }
    for (int i = a.length() - 1;i >= 0;i--) {
        sum = (a[i] - '0') + (b[i] - '0') + carry;
        carry = sum / 10;
        result = char(sum % 10 + '0') + result;
    }
    if (carry > 0)result = '1' + result;
    return result;
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;


    vector<string> arr = vector<string>(n+1);
    
    arr[0] = "0";
    if (n > 0) {
        arr[1] = "1";
    }
    
    for (int i = 2;i <=n;i++) {
        arr[i] = fibonacci(arr[i - 1], arr[i - 2]);
        
    }
    cout << arr[n];

    return 0;
}