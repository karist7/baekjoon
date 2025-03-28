#include <iostream>
#include <vector>
#include <queue>
using namespace std;


vector<vector<int>> graph;
vector<vector<int>> answer;
vector<vector<bool>> visited;
int n, m;
int dx[] = { 0,0,-1,1 };
int dy[] = { -1,1,0,0 };
queue<pair<int,int>> que;
void bfs(int x,int y) {
	que.push({ x,y });
	visited[x][y] = true;
	
	while (!que.empty()) {
		int qx = que.front().first;
		int qy = que.front().second;
		que.pop();
		for (int i = 0;i < 4;i++) {
			int fx = qx + dx[i];
			int fy = qy + dy[i];
			if (fx >= 0 && fx < n && fy >= 0 && fy < m) {
				if (!visited[fx][fy] && graph[fx][fy] != 0) {
					que.push({ fx,fy });
					visited[fx][fy] = true;
					answer[fx][fy] = answer[qx][qy] + 1;
				}
			}
		}

	}
}
int main() {
	ios::sync_with_stdio(0);
	cin.tie(nullptr);
	cin >> n>> m;
	graph = vector<vector<int>>(n, vector<int>(m, 0));
	answer = vector<vector<int>>(n, vector<int>(m, -1));
	visited = vector<vector<bool>>(n, vector<bool>(m, false));

	int startX, startY;
	for (int i = 0;i < n;i++) {
		for (int j = 0;j < m;j++) {
			cin >> graph[i][j];
			if (graph[i][j] == 2) {
				startX = i;
				startY = j;
				answer[i][j] = 0;
			}
			else if (graph[i][j] == 0) {
				answer[i][j] = 0;
			}
				
		}
	}
	
	bfs(startX, startY);
	
	for (int i = 0;i < n;i++) {
		for (int j = 0;j < m;j++) {
			cout << answer[i][j] << " ";
		}
		cout << endl;
	}

	return 0;
}