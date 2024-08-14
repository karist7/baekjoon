import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 문서의 개수
            int m = Integer.parseInt(st.nextToken()); // 알고 싶은 문서의 위치
            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                queue.add(new int[] { j, Integer.parseInt(st.nextToken()) });
            }
            int count = 0;
            while(!queue.isEmpty()){
                int[] front = queue.poll();
                boolean hasHigherPriority = false;

                for (int[] doc : queue) {
                    if (doc[1] > front[1]) {
                        hasHigherPriority = true;
                        break;
                    }
                }
                if(hasHigherPriority)
                    queue.add(front);
                else{
                    count++;
                    if(front[0]==m){
                        bw.write(count+"\n");
                        break;
                    }

                }
            }
        }
        bw.close();
    }
}