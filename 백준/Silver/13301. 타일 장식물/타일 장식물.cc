#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    long long fibo[81];
    fibo[0] = 0;
    fibo[1] = 1;
    for (int i = 2;i <= n;i++) {
        fibo[i] = fibo[i - 1]+ fibo[i - 2];
    }
    
    
    int circumference = (fibo[n] + (fibo[n] + fibo[n - 1])) * 2;
    cout << circumference;
    return 0;
}
