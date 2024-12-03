#include <iostream>
#include <vector>

using namespace std;
#define MAX 101

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;

    long long tr[MAX] = { 0,1,1,1 };

    for (int i = 4;i < MAX;i++) {
        tr[i] = tr[i - 2] + tr[i - 3];
        
    }
    

    for (int i = 0;i < n;i++) {
        int d;
        cin >> d;
        cout << tr[d] << "\n";
    }
    

    return 0;
}
