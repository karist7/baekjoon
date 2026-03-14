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
	int arr[42] = { 0 };
	int n;
	for (int i = 0; i < 10; i++) {
		cin >> n;
		n %= 42;
		arr[n]++;
	}
	int k = 0;
	for (int i = 0; i < 42; i++) {
		if (arr[i] != 0) {
			k++;
		}
	}
	cout << k;
}