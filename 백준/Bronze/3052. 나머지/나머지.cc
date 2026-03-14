#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <stack>
#include <queue>
#include <unordered_set>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	unordered_set<int> s;
	int n;
	for (int i = 0; i < 10; i++) {
		cin >> n;
		n %= 42;
		s.insert(n);
	}
	
	cout << s.size();
}