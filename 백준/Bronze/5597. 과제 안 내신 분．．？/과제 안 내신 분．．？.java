import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[30];
        for(int i = 0;i<30;i++){
            arr[i]=i+1;
        }
        boolean[] answer = new boolean[30];

        for(int i=0;i<28;i++){
            int a = Integer.parseInt(br.readLine());
            answer[a-1] = true;

        }
        for(int i=0;i<30;i++){
            if(answer[i]==false)
                bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}