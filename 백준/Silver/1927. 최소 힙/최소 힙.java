import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            int d = Integer.parseInt(br.readLine());
            if(d==0){
                if(queue.isEmpty()){
                    bw.write(0+"\n");
                }
                else{
                    bw.write(Math.abs(queue.poll())+"\n");
                }
            }
            else{
                queue.add(d);
            }

        }

        bw.close();
    }
}