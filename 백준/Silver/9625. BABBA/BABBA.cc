#include <iostream>

#include <algorithm>


using namespace std;


int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    int a[46] = { 1, 0 };
    int b[46] = { 0, 1};
    for (int i = 2;i <= n;i++) {
        a[i] = a[i - 1] + a[i - 2];
        b[i] = b[i - 1] + b[i - 2];
    }
    
    cout << a[n] << " "<<b[n];

    return 0;
}
