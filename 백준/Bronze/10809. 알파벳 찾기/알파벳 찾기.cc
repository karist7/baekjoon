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
	int arr[26] = { 0 };
	for (int i = 0; i < 26; i++) {
		arr[i] = -1;
	}
	
	for (int i = 0; i < s.length(); i++) {
		if (arr[s[i] - 'a'] == -1) {
			arr[s[i] - 'a'] = i;
		}
	}
	for (int i = 0; i < 26; i++) {
		cout << arr[i] << " ";
	}
}