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
	int n;
	string s;
	cin >> n;
	string buffer;
	queue<int> que;

	for (int i = 0; i < n; i++) {
		cin >> s;

		if (s.compare("push") == 0) {
			int x;
			cin >> x;

			que.push(x);
		}
		else if (s.compare("front") == 0) {
			if (que.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << que.front() << "\n";
			}
		}
		else if (s.compare("pop") == 0) {
			if (que.empty()) {
				cout << -1 << "\n";
			}
			else {

				cout << que.front() << "\n";
				que.pop();
			}
		}
		else if (s.compare("size") == 0) {
			cout << que.size() << "\n";
		}
		else if (s.compare("back") == 0) {
			if (que.empty()) {
				cout << -1 << "\n";
			}
			else {

				cout << que.back() << "\n";
				
			}
		}
		else {
			if (que.empty()) {
				cout << 1 << "\n";
			}
			else {

				cout << 0 << "\n";
			}
		}

	}

}