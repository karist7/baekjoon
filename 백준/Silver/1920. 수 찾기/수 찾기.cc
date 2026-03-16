#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <stack>
#include <queue>


using namespace std;
int binary_search(int start, int end, int sol);
vector<int> vec1, vec2;
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	int n,m;
	cin >> n;
	for (int i = 0; i < n; i++) {
		int x;
		cin >> x;
		vec1.push_back(x);
	}
	cin >> m;
	for (int i = 0; i < m; i++) {
		int x;
		cin >> x;
		vec2.push_back(x);
	}
	sort(vec1.begin(), vec1.end());
	for (int x : vec2) {


		cout << binary_search(0, vec1.size()-1, x) << "\n";
	}

}
int binary_search(int start, int end, int sol) {
	
	while (start <= end) {
		int mid = (start + end) / 2;
		if (sol > vec1[mid]) {
			start = mid + 1;
		}
		else if (sol < vec1[mid]) {
			end = mid - 1;
		}
		else return 1;
	}
	return 0;



}