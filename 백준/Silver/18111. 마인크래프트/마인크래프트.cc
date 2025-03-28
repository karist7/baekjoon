#include <iostream>
#include <vector>
using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(nullptr);
	vector<vector<int>> vec;
	int time = 999999999,height;
	int n, m, b;
	cin >> n >> m >> b;
	vec = vector<vector<int>>(n, vector<int>(m, 0));

	for (int i = 0;i < n;i++) {
		for (int j = 0;j < m;j++) {
			cin >> vec[i][j];
		}
	}
	for (int k = 0;k <= 256;k++) {
		int sum = 0, tmp = b;
		for (int i = 0;i < n;i++) {
			for (int j = 0;j < m;j++) {
				if (vec[i][j] < k) {
					sum += k - vec[i][j];
					tmp -= k - vec[i][j];
				}
				else if(vec[i][j]>k){
					sum += (vec[i][j] - k) * 2;
					tmp += vec[i][j] - k;
				}
				else {
					continue;
				}
			}
		
		}
		if (tmp >= 0) {
			if (sum <= time) {
				time = sum;
				height = k;
			}
		}
	}
	cout << time << " " << height;

	return 0;
}