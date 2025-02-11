#include <iostream>
#include <vector>
#include <stack>
using namespace std;

vector<vector<int>> graph;
int blue=0,white=0;
void rec(int y,int x,int size){
    bool cut = false;
    int first_color = graph[y][x];
    for(int i=y;i<y+size;i++){
        for(int j=x;j<x+size;j++){
            if(graph[i][j]!=first_color){
                cut=true;
                break;
            }
        }
    }
    if(cut){
        rec(y,x,size/2);
        rec(y,x+size/2,size/2);
        rec(y+size/2,x,size/2);
        rec(y+size/2,x+size/2,size/2);
    }
    else{
        if(first_color==1){
            blue++;
        }
        else{
            white++;
        }
    }
}
int main(void)
{
    int n;
    cin>>n;
    graph = vector<vector<int>>(n,vector<int>(n,0));

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int d;
            cin>>d;
            graph[i][j] = d;
        }
    }
    rec(0,0,n);
    cout<<white<<"\n";
    cout<<blue<<"\n";
    return 0;
}