#include <iostream>
#include <vector>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, k;
    cin >> n >> k;

    // 2D 벡터 생성
    vector<vector<int>> arr = vector<vector<int>>(n + 1);

    for (int i = 0; i <= n; i++) {
        arr[i] = vector<int>(i + 1, 1); // 각 행에 맞는 크기의 벡터 생성 및 초기화
        for (int j = 1; j < i; j++) {
            arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
        }
    }

    cout << arr[n-1][k-1];

    return 0;
}
