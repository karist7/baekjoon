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
	stack<int> st;

	for (int i = 0; i < n; i++) {
		cin >> s;
		
		if (s.compare("push")==0) {
			int x;
			cin >> x;
			
			st.push(x);
		}
		else if (s.compare("top") == 0) {
			if (st.empty()) {
				cout << -1 << "\n";
			}
			else {
				cout << st.top() << "\n";
			}
		}
		else if (s.compare("pop") == 0) {
			if (st.empty()) {
				cout << -1 << "\n";
			}
			else {
				
				cout << st.top() << "\n";
				st.pop();
			}
		}
		else if (s.compare("size") == 0) {
			cout << st.size() << "\n";
		}
		else {
			if (st.empty()) {
				cout << 1 << "\n";
			}
			else {

				cout << 0 << "\n";
			}
		}
	
	}

}