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
	string s;
	cin >> s;
	int m = 0;
	int k = 0;
	int total = 0;
	for (int i = 0; i < 13; i++) {
		if (s[i] != '*') {
			if (i % 2 == 0) {
				total += (s[i] - '0');
			}
			else {
				total += ((s[i] - '0') * 3);
			}
		}
		else {
			if (i % 2 == 0) {
				k = 1;
			}
			else {
				k = 3;
			}
		}
	}
	for (int i = 0; i < 10; i++) {
		if ((total + (k * i)) % 10 == 0) {
			m = i;
			break;
		}
	}

	
	cout << m;

}