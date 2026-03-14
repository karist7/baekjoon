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
	cin >> n;
	string s;
	for (int i = 0; i < n; i++) {
		int l = 0;
		int total = 0;
		cin >> s;
		for (int j = 0; j < s.length(); j++) {
			if (s[j] == 'O') {
				l++;
				total += l;
			}
			else {
				l = 0;
			}
		}
		cout << total<<"\n";
	}
	
}