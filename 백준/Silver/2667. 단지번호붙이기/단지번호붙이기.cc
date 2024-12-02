#include <iostream>
#include <vector>
#include <stack>
#include <algorithm>
using namespace std;

static vector<vector<int>> graph;
static vector<vector<bool>> visited;
static int cnt;
static int dx[] = { 0,0,-1,1 };
static int dy[] = { -1,1,0,0 };
static int n;

static vector<int> answer;
void dfs(int i,int j) {
    
    stack<pair<int,int>> st;
    visited[i][j] = true;
    st.push({i,j});
    cnt++;
    while (!st.empty()) {

        int a = st.top().first;
        int b = st.top().second;
        st.pop();
        for (int k = 0;k < 4;k++) {
            int x = a + dx[k];
            int y = b + dy[k];
            
            if (x < n && x >= 0 && y < n && y >= 0) {
                
                if (!visited[x][y]&&graph[x][y]==1) {
                    st.push({ x,y });
                    visited[x][y] = true;
                    cnt++;
                }
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    
    cin >> n;
    

    graph = vector<vector<int>>(n, vector<int>(n));
    visited = vector<vector<bool>>(n,vector<bool>(n));
    answer = vector<int>();

    for (int i = 0; i < n; i++) {
        string line;
        cin >> line;
        for (int j = 0; j < n; j++) {
            graph[i][j] = line[j] - '0'; // 문자형 숫자를 정수로 변환
        }
    }

    for (int i = 0;i < n;i++) {
        for (int j = 0;j < n;j++) {
            cnt = 0;
            if (!visited[i][j]&&graph[i][j]!=0) {
                dfs(i,j);
                answer.push_back(cnt);
            }
        }
        
    }
    sort(answer.begin(), answer.end());
    cout << answer.size() << "\n";
    for (int i = 0;i < answer.size();i++) {
        cout << answer[i] << "\n";
    }
    


    return 0;
}
