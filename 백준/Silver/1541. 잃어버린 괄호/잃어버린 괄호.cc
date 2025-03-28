#include <iostream>
#include <vector>
#include <sstream>
#include <string>

using namespace std;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(nullptr);
	string str;
	string data;
	cin >> str;
	istringstream ary(str);
	vector<string> firstVec;
	vector<int> nums;
	int total;
	while (getline(ary, data, '-')){
		firstVec.push_back(data);
	}
	for (string s:firstVec) {
		if (s.length() <= 2) {
			nums.push_back(stoi(s));
		}
		else {
			int sub = 0;
			string subs;
			istringstream ss(s) ;
			
			while (getline(ss, subs, '+')) {
				sub += stoi(subs);
			}
			nums.push_back(sub);
		}
		
	}
	total = nums[0];
	for (int i = 1;i < nums.size();i++) {
		total -= nums[i];
	}
	cout << total;

	return 0;
}