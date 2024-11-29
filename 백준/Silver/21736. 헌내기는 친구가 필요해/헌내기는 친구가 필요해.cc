#include <iostream>
#include <vector>
#include <stack>
using namespace std;

static int dx[] = { 0, 0, -1, 1 };
static int dy[] = { -1, 1, 0, 0 };
static vector<vector<bool>> visited;
static vector<vector<char>> graph;
static int n, m;
static int pCount;

void dfs(int startX, int startY) {
    stack<pair<int, int>> stk;  
    stk.push({ startX, startY }); 

    while (!stk.empty()) {
        int a = stk.top().first;
        int b = stk.top().second;
        stk.pop(); 

        // 이미 방문한 곳은 스킵
        if (visited[a][b]) continue;  
        visited[a][b] = true;  

        // 'P'를 만나면 카운트 증가
        if (graph[a][b] == 'P') {
            pCount++;
        }

        // 상하좌우로 탐색
        for (int i = 0; i < 4; i++) {
            int x = dx[i] + a;
            int y = dy[i] + b;

            // 경계를 벗어나지 않도록 체크하고, 'X'는 스킵
            if (x >= 0 && x < n && y >= 0 && y < m && !visited[x][y] && graph[x][y] != 'X') {
                stk.push({ x, y });
            }
        }
    }
}

int main() {
    cin >> n >> m;
    pCount = 0;
    graph = vector<vector<char>>(n, vector<char>(m));
    visited = vector<vector<bool>>(n, vector<bool>(m, false));

    int row, column;

    // 'I'의 위치 찾기
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> graph[i][j]; 
            if (graph[i][j] == 'I') {
                row = i;
                column = j;
            }
        }
    }

    // DFS 시작
    dfs(row, column);

    // 'P'가 없다면 "TT" 출력, 있다면 카운트 출력
    if (pCount == 0) {
        cout << "TT";
    } else {
        cout << pCount;
    }

    return 0;
}
