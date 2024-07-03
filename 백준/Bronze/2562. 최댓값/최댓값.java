import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = new int[9];

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0;i<9;i++){
            a[i] = Integer.parseInt(br.readLine());
            if(a[i]>max) {
                max = a[i];
                idx = i+1;
            }
        }
        bw.write(max+"\n");
        bw.write(idx+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}