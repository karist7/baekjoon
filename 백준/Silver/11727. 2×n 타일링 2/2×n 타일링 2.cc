#include <iostream>


using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int arr[1001];
    arr[1] = 1;
    arr[2] = 3;
    for (int i = 3;i < 1001;i++) {
        arr[i] = (arr[i - 1] + arr[i - 2] * 2) % 10007;
    }
    int n;
    cin >> n;
    cout << arr[n];


    return 0;
}
