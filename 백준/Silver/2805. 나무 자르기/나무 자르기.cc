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
		if(max<vec[i])
			max = vec[i];
	}
	long max_value = 0;
	while (min<=max) {
		mid = (max + min) / 2;
		long count = 0;
		for (int i = 0; i < n; i++) {
			if (vec[i] > mid) {
				count += (vec[i] - mid);
				
			}

		}
		if (k <=count) {
			max_value = mid;
			min = mid+1;
		}
		else {
			max = mid -1;
		}
	}
	cout << max_value;
	return 0;
}