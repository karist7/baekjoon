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
	int m = 666;

	int sol = 0;
	int total = 0;
	while (sol != n) {
		string s = to_string(m);
		for (int i = 0; i < s.length() - 2; i++) {
			if (s.substr(i, 3).compare("666") == 0){
				sol++;
				total = m;
				break;
			}
		}
		
		m++;
	}
	cout << total;

}