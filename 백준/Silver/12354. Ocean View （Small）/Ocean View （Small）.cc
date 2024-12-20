#include <iostream>
#include <vector>

using namespace std;

int main(void)
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int result = 0;
        int m;
        cin >> m;
        vector<int> arr(m);
        
        for (int j = 0; j < m; j++) {
            cin >> arr[j];
        }
        
        for (int j = 1; j < m; j++) {
            if (arr[j] <= arr[j - 1]) {
                result++;
            }
        }

        cout << "Case #" << i + 1 << ": " << result << "\n";
    }

    return 0;
}
