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
		arr[i] = 100;
	}
	int n = 0;
	for (int i = 0; i < s.length(); i++) {	
		if (arr[s[i] - 97] == 100) {
			arr[s[i] - 97] = n;
		}
		n++;
		
	}
	for (int i = 0; i < 26; i++) {
		if (arr[i] == 100) {
			cout << -1 << " ";
		}
		else {

			cout << arr[i] << " ";
		}
	}
	
	
	
}