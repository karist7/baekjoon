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
	string cro[] = { "c=","c-","dz=","d-","lj","nj","s=","z=" };
	string str;
	cin >> str;
	
	for (int i = 0; i < 8; i++) {
		size_t pos = 0;
		
		while ((pos = str.find(cro[i], pos)) != string::npos) {
			str.replace(pos, cro[i].length(), "*");
		}
		
	}
	cout << str.length();
}
