#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    int m = 0;

    while (n!=0) {
        if (n - 3 >= 0) {
            n -= 3;
        }
        else if (n - 1 >= 0) {
            n -= 1;
        }
        m++;
        
    }
    if (m % 2 == 1) {
        cout << "SK";
   }
    else {
        cout << "CY";
    }

    return 0;
}
