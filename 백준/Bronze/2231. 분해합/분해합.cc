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
	int total = 0;
	for (int i = n; i >= 0; i--) {
		int k = 0;
		for (int j = i; j > 0; j /= 10) {
			k += (j%10);
			
		}
		
		if ((i + k) == n) {
			total = i;
		}
	}
	cout << total;

}