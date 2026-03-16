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
	for (int i = 0; i < s.length(); i++) {
		if ('A' <= s[i] && s[i] <= 'Z') {
			
			
			arr[s[i] - 'A']++;
		}
		else {

			arr[s[i] - 'a']++;
		}
	}
	int n = 0;
	int duplicate = 0;
	n = *max_element(arr,arr+26);

	char sol = 0;
	for (int i = 0; i < 26; i++) {
		if (arr[i] == n) {
			duplicate++;
			sol = i+'A';
		}

	}
	if (duplicate != 1) {
		cout << "?" << "\n";
	}
	
	else {
		cout << sol << "\n";
	}


}