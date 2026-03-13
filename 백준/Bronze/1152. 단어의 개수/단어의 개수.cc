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
	string str;
	getline(cin,str);
	int a = 0;
	int sol = 0;
	
	if (!str.empty() && str.at(0)==' ' ) {
		str.erase(0, 1);
	}
	if (!str.empty() && str.at(str.length() - 1) == ' ' ) {
		str.erase(str.length() - 1, str.length());
	}
	for (int i = 0; i < str.length(); i++) {
		if (str[i] == ' ') {
			sol++;
		}
	}
	if (str.length() == 0) {
		cout << sol;
	}
	else {

		cout << sol + 1;
	}
}