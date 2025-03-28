#include <iostream>
#include <vector>
#include <queue>

using namespace std;
queue<int> que;

vector<bool> visited;
int cnt = 0;
bool flag = false;
int n, k;
void bfs(int start) {
	visited[start] = true;
	que.push(start);
	while (!que.empty()) {
		int size = que.size();
		for (int i = 0;i < size;i++) {
			int data = que.front();
			que.pop();

			if (data == k) {
				cout << cnt;
				return;
			}
			int next_pos[] = { data - 1,data + 1,data * 2 };
			for (int nxt : next_pos) {
				if (nxt >= 0 && nxt <= 100000 && !visited[nxt]) {
					visited[nxt] = true;
					que.push(nxt);
				}
			}
		}
		cnt++;
	}
	
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(nullptr);
	
	cin >> n >> k;

	
	visited = vector<bool>(100001, false);
	bfs(n);

	return 0;
}