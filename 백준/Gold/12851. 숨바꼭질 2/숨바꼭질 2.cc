#include <iostream>
#include <vector>
#include <queue>

using namespace std;
queue<int> que;

vector<int> dist(100001, -1);
vector<int> cnt(100001, 0);

int n, k;
void bfs(int start) {
	
	dist[start] = 0;
	cnt[start] = 1;

	que.push(start);

	while (!que.empty()) {
		int cur = que.front();
		que.pop();
		int next_pos[] = { cur - 1, cur + 1, cur * 2 };
		for (int nxt : next_pos) {
			if (nxt < 0 || nxt>100000) continue;
			if (dist[nxt] == -1) {
				dist[nxt] = dist[cur] + 1;
				cnt[nxt] = cnt[cur];
				que.push(nxt);
			}
			else if (dist[nxt] == dist[cur] + 1) {
				cnt[nxt]+=cnt[cur];
			}
		}
	}
}
int main() {
	ios::sync_with_stdio(0);
	cin.tie(nullptr);
	
	cin >> n >> k;

	

	bfs(n);

	cout << dist[k] << "\n";  
	cout << cnt[k] << "\n";  
	return 0;
}