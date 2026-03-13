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
	int n, x;
	cin >> n >> x;
	int a;
	for (int i = 0; i < n; i++) {
		cin >> a;
		if (x > a) {
			cout << a << " ";
		}
	}

	
}