#include <iostream>
#include <vector>
#include <stack>
using namespace std;

static int dx[] = {0,0,-1,1};
static int dy[] = { -1,1,0,0 };
static vector<vector<bool>> visited;
static vector<vector<char>> graph;
static int n, m;
static int pCount;
void dfs(int a,int b) {
    visited[a][b] = true;
    for (int i = 0;i < 4;i++) {
        int x = dx[i] + a;
        int y = dy[i] + b;
        if (x >= 0 && x < n && y >= 0 && y < m) {
            if (!visited[x][y] && (graph[x][y] == 'O' || graph[x][y] == 'P')) {
                if (graph[x][y] == 'P') {
                    pCount++;
                }
                dfs(x,y);
            }
        }
    }
}

int main() {
    
    cin >> n >> m; 
    pCount = 0;
    graph = vector<vector<char>>(n, vector<char>(m));
    visited = vector<vector<bool>>(n, vector<bool>(m, false));

    int row,column;


    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> graph[i][j]; // 각 문자 입력받기
            if (graph[i][j] == 'I') {
                row = i;
                column = j;
            }
        }
    }
    
    dfs(row, column);
    if (pCount == 0) {
        cout << "TT";
    }
    else {
        cout << pCount;
    }
    
    return 0;
}
