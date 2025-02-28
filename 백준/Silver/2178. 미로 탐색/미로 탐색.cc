#include <iostream>
#include <vector>
#include<queue>
using namespace std;

vector<vector<int>> graph;
vector<vector<bool>> visited;
vector<int> dx = { 0, 0, 1, -1 };
vector<int> dy = { 1, -1, 0, 0 };
vector<vector<int>> dist;

int n, m;
void bfs(int startX, int startY) {
     queue<pair<int,int>> qu;
     qu.push({ startX, startY });
     visited[startX][startY] = true;
     dist[startX][startY] = 1;
     while (!qu.empty()) {
         int first = qu.front().first;
         int second = qu.front().second;
         qu.pop();
         int s = qu.size();
         for (int i = 0; i < 4; i++) {
             int x = first + dx[i];
             int y = second + dy[i];
             if (x >= 0 && x < n && y >= 0 && y < m) {
                 if (!visited[x][y]&&graph[x][y]==1) {
                     qu.push({ x,y });
                     visited[x][y] = true;
                     dist[x][y] = dist[first][second] + 1;
                     
                 }
                
             }
         }
     }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(nullptr);

    
    cin >> n >> m;


    graph = vector<vector<int>>(n, vector<int>(m, 0));
    visited = vector<vector<bool>>(n, vector<bool>(m, 0));
    dist = vector<vector<int>>(n, vector<int>(m, 0));
  
    for (int i = 0; i < n; i++) {
        string row;
        cin >> row;
        for (int j = 0; j < m; j++) {  
            graph[i][j] = row[j]-'0';
        }
    }
    bfs(0, 0);
    cout << dist[n - 1][m - 1];
    return 0;
}
