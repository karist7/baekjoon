#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <stack>
#include <queue>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int maxVal = INT32_MIN;
	int idx = 0;
	int a;
	
	for (int i = 0; i < 9; i++) {
		cin >> a;
		if (maxVal < a) {
			maxVal = a;
			idx = i;
		}

	}
	cout << maxVal << "\n" << idx+1;

	
}