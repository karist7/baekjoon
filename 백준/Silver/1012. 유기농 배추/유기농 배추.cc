#include <iostream>
#include <vector>
#include <stack>
using namespace std;
stack<pair<int,int>> st;
vector<vector<int>> graph;
vector<vector<bool>> visited;
int cnt;
int dx[] = {-1,1,0,0};
int dy[] = {0,0,-1,1};
int n,m,k;
void dfs(){
    cnt++;
    while(!st.empty()){

        int data1 = st.top().first;
        int data2 = st.top().second;
        st.pop();
        for(int i=0;i<4;i++){
            int x = data1+dx[i];
            int y = data2+dy[i];    
            if(x>=0&&x<m&&y>=0&&y<n){
                if(graph[x][y]==1&&!visited[x][y]){
                    visited[x][y]=true;
                    st.push({x,y});
                }
            }       
            
        }
    }
}
int main(void)
{
    int T;
    
    int a,b;
    cin>>T;
    
    while(T--){
        cnt=0;
        cin>>n>>m>>k;
        graph = vector<vector<int>>(m,vector<int>(n,0));
        visited = vector<vector<bool>>(m,vector<bool>(n,0));
        for(int i=0;i<k;i++){
            cin>>a>>b;
            graph[b][a]=1;
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(!visited[i][j]&&graph[i][j]==1){
                    st.push({i,j});
                    visited[i][j] = true;
                    dfs();
               }
            }
            
        }
        cout<<cnt<<"\n";
       
    }
    return 0;
}