#include <iostream>
#include <list>
#include<algorithm>

using namespace std;
void dfs(char c,int a,int b);

static int dx[] = {0,0,-1,1};
static int dy[] = { -1,1,0,0 };
static char **graph;
static int n;
static bool **visited;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	cin >> n;
	graph = new char*[n];
	int count = 0;
	int count2 = 0;
	for (int i = 0; i < n; i++) {
		graph[i] = new char[n];
	}
	visited = new bool* [n];
	for (int i = 0;i < n;i++) {
		visited[i] = new bool[n];
	}

	string str = "";
	for (int i = 0;i < n;i++) {
		cin >> str;
		for (int j = 0;j < n;j++) {
			graph[i][j] = str[j];
			visited[i][j] = false;
		}
	}
	for (int i = 0;i < n;i++) {
		
		for (int j = 0;j < n;j++) {
			if (!visited[i][j]) {
				dfs(graph[i][j], i, j);
				count++;
			}
			
		}
		
	}
	

	for (int i = 0;i < n;i++) {
		
		for (int j = 0;j < n;j++) {
			if (graph[i][j] == 'R') {
				graph[i][j] = 'G';
			}
			visited[i][j] = false;
		}
	}
	for (int i = 0;i < n;i++) {

		for (int j = 0;j < n;j++) {
			if (!visited[i][j]) {
				dfs(graph[i][j], i, j);
				count2++;
			}

		}

	}
	cout << count << " "<< count2;
	for (int i = 0; i < n; i++) {
		delete[] graph[i];
		delete[] visited[i];
	}
	delete[] graph;
	delete[] visited;


}
void dfs(char c, int a, int b) {
	visited[a][b] = true;
	for (int i = 0;i < 4;i++) {
		int x = a + dx[i];
		int y = b + dy[i];
		if (x >= 0 && x < n && y < n && y >= 0) {
			if (!visited[x][y] && graph[a][b] == graph[x][y]) {
				dfs(graph[x][y], x, y);
			}

		}
	}
	

	
}
