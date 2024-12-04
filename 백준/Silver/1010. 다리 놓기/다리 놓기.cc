#include <iostream>
using namespace std;

long long combination(int n, int r) {
    
    long long result = 1;

    for (int i = 1; i <= r; i++) {
        result *= (n-i+1);    
        result /= i;    
    }

    return result;
}

int main() {
    int T;
    cin >> T;
    int n, m;
    for (int i = 0;i < T;i++) {
        cin >> n >> m;
        cout << combination(m, n) << "\n";

    }
    return 0;
}
