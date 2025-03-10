#include <iostream>

#include<vector>

using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(nullptr);
	long min=0, mid = 0,max = 0;
	int n, k;
	cin >> n >> k;
	vector<int> vec = vector<int>(n, 0);
	for(int i=0;i<n;i++) {
		cin >> vec[i];
		if (max < vec[i])
			max = vec[i];
	}
	max++;
	while (min < max) {
		mid = (max + min) / 2;
		int count = 0;
		for (int i = 0; i < n; i++) {
			count += vec[i] / mid;
		}
		if (k > count) {
			max = mid;
		}
		else {
			min = mid + 1;
		}
	}
	cout << max - 1;
	return 0;
}