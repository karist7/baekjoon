#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool customSort(pair<int, int> a, pair<int, int>b) {
    if (a.second == b.second)
        return a.first < b.first;
    return a.second < b.second;
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int n;
    cin >> n;
    
    vector<pair<int, int>> vec;
   
    
    for (int i = 0;i < n;i++) {        
        int a, b;
        cin >> a >> b;
        vec.push_back({ a,b });
    }
    int count = 1;
    sort(vec.begin(), vec.end(),customSort);
    int end = vec.front().second;
    for (auto it = vec.begin()+1;it != vec.end();it++) {
        if (end <= it->first) {                
                end = it->second;
                count++;
        }
    }
    cout << count;
    


    return 0;
}
