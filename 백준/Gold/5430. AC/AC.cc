#include <iostream>
#include <algorithm>
#include<deque>
#include<sstream>
#include <string>
using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(nullptr);

	deque<string> deq;
	string msg;
	int n;
	int T;
	int x;
	string arr;
	
	cin >> T;
	while (T--) {
		cin >> msg;
		cin >> x;
		cin >> arr;
		arr.erase(arr.begin());
		arr.erase(arr.end()-1);
		int num;
		string data;
		istringstream ary(arr);
		bool flag = false;
		int R = 0;
		while (getline(ary, data, ',')) {
			deq.push_back(data);
		}
		for (int i = 0; i < msg.length(); i++) {
			if (msg[i] =='D') {
				if (deq.size() != 0 && R % 2 == 0)
					deq.pop_front();
				else if (deq.size() != 0 && R % 2 == 1)
					deq.pop_back();
				else {
					cout << "error\n";
					flag = true;
					break;
				}
			}
			else {
				R++;
			}
		}
		if(R%2==1)
			reverse(deq.begin(),deq.end());

		if (!flag) {
			cout << "[";
			for (int i = 0; i < deq.size(); i++) {
				if (i == deq.size() - 1) {
					cout << deq[i];
				}
				else {
					cout << deq[i] << ",";
				}
			}
			cout << "]\n";
		}
		deq.clear();
	}
	return 0;
}