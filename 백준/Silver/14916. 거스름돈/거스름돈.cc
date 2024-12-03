#include <iostream>
#include <vector>

using namespace std;

#define SIZE 100001

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    int arr[SIZE];
    arr[0] = 0;
    arr[1] = 0;
    arr[2] = 1;
    arr[3] = 0;
    arr[4] = 2;
    arr[5] = 1;
    int coin[] = { 2,5 };
    for (int i = 6;i < SIZE;i++) {
        arr[i] = i;
        for (int j = 0;j < 2;j++) {
            if (arr[i - coin[j]] != 0) {
                arr[i] = min(arr[i - coin[j]] + 1, arr[i]);
            }
        }
        
    }
    if (arr[n] != 0)
        cout << arr[n];
    else
        cout << -1;
    

    return 0;
}
