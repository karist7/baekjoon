import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static LinkedList<Integer>[] adjList;  // 하나의 인접 리스트로 통합
    static LinkedList<Integer> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  // 노드의 개수
        int m = Integer.parseInt(st.nextToken());  // 간선의 개수
        int v = Integer.parseInt(st.nextToken());  // 시작 노드 번호

        visited = new boolean[n + 1];  

        result = new LinkedList<>();

        adjList = new LinkedList[n + 1];
        for (int i = 0; i <= n; i++) {
            adjList[i] = new LinkedList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList[a].add(b);
            adjList[b].add(a);
        }


        for (int i = 0; i <= n; i++) {
            adjList[i].sort(Comparator.naturalOrder());
        }


        dfs(v);

        for (int i : result) {
            bw.write(i + " ");
        }
        bw.newLine();
        visited = new boolean[n + 1];  // DFS 방문 체크
        // BFS 탐색
        bfs(v);

        for (int i : result) {
            bw.write(i + " ");
        }

        bw.close();
    }


    static void dfs(int v) {
        visited[v] = true;
        result.add(v);

        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    static void bfs(int v) {
        LinkedList<Integer> queue = new LinkedList<>();
        result.clear();
        visited[v] = true;
        queue.add(v);
        result.add(v);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    result.add(neighbor);
                }
            }
        }
    }
}
