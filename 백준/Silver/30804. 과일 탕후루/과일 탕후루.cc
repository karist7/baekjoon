#include <iostream>
#include <vector>
#include <list>

using namespace std;

int main(void)
{
    vector<int> fruit(10, 0);
    ios::sync_with_stdio(0);
    cin.tie(0);
    list<int> l;
    int n;
	cin >> n;
	int cnt = 0;
	int result = 0;
	int len = 0;
    for(int i=0;i<n;i++){
        int d;
        cin>>d;
        len++;
        l.push_back(d);
        
        if(fruit[d]==0) cnt++;
        fruit[d]++;
        while(cnt>2){
            int data = l.front();
            fruit[data]--;
            l.pop_front();
            len--;
            if(fruit[data]==0) cnt--;
        }
        result = max(result,len);
    }
    cout<<result;
    return 0;
}
