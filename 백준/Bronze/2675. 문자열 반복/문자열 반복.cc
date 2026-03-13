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
	int x;
	cin >> x;
	for (int i = 0; i < x; i++) {
		string str = "";
		int y;
		string sub;
		cin >> y >> sub;
		for (int j = 0; j < sub.length(); j++) {
			for (int k = 0; k < y; k++) {
				str += sub[j];
			}
		}
		cout << str << "\n";
	}
}