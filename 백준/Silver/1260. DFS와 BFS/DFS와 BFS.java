import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static boolean[] visited2;

    static LinkedList[] linkedLists;
    static LinkedList[] linkedLists2;
    static LinkedList<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        visited2 = new boolean[n+1];
        result = new LinkedList<>();
        linkedLists = new LinkedList[n+1];
        linkedLists2 = new LinkedList[n+1];
        for(int i=0;i<n+1;i++){
            linkedLists[i] = new LinkedList();
            linkedLists2[i] = new LinkedList();
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            linkedLists[a].add(b);
            linkedLists[b].add(a);
            linkedLists2[a].add(b);
            linkedLists2[b].add(a);
        }
        for(int i=0;i<=n;i++){
            linkedLists[i].sort(Comparator.naturalOrder());
            linkedLists2[i].sort(Comparator.naturalOrder());
        }
        result.add(v);
        visited[v] = true;
        for(int i=1;i<=n;i++){
            if(!visited[i]){

                dfs(v);
            }
        }

        for(int i=0;i<result.size();i++){
            bw.write(result.get(i)+" ");
        }
        bw.write("\n");
        result.clear();
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(v);
        result.add(v);
        visited2[v] = true;
        while (!queue.isEmpty()){
            int num = queue.pollFirst();
            visited2[num] = true;

            while(!linkedLists2[num].isEmpty()){
                int nn = (int) linkedLists2[num].pollFirst();
                if(!visited2[nn]){
                    queue.add(nn);
                    if(!result.contains(nn))
                        result.add(nn);
                }
            }


        }

        for(int i=0;i<result.size();i++){
            bw.write(result.get(i)+" ");
        }
        bw.close();
    }
    static private void dfs(int v){
        visited[v] = true;
        while(!linkedLists[v].isEmpty()){

            int d = (int) linkedLists[v].pollFirst();
            if(!visited[d]){
                visited[d]=true;
                result.add(d);
                dfs(d);
            }
        }


    }
}