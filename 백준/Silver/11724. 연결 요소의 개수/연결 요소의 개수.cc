#include <iostream>
#include <vector>
#include <stack>
using namespace std;

static vector<vector<int>> graph;
static vector<bool> visited;
static int cnt;
void dfs(int start) {
    
    stack<int> st;
    visited[start] = true;
    st.push(start);
    while (!st.empty()) {
        int v = st.top();
        st.pop();

        for (int i = 0; i < graph[v].size(); i++) {
            int next = graph[v][i];
            if (!visited[next]) {
                visited[next] = true;
                st.push(next);
            }
        }
        
    }
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int n, m;
    cin >> n >> m;
    cnt = 0;

    graph = vector<vector<int>>(n+1, vector<int>());
    visited = vector<bool>(n + 1);

    for (int i = 0;i < m;i++) {
        int u, v;
        cin >> u >> v;
        graph[u].push_back(v);
        graph[v].push_back(u);
        
    }

    for (int i = 1;i <= n;i++) {
        if (!visited[i]) {
            dfs(i);
            cnt++;
        }
        
    }
    cout << cnt;


    return 0;
}
