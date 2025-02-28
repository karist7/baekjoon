#include <iostream>
#include <queue>
#include <math.h>
using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(nullptr);

	priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
	int n;
	cin >> n;
	while (n--) {
		int d;
		cin >> d;
		if (d == 0) {
			if (pq.empty()) {
				cout << 0 << "\n";
			}
			else {
				cout << pq.top().second << "\n";
				pq.pop();
			}
		}
		else {
			pq.push({ abs(d), d });
		}
	}
	return 0;
}