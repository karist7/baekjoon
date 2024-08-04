import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[11];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i-1]*i;
        }
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int total=arr[k]/(arr[n]*arr[k-n]);
        bw.write(total+"\n");

        bw.close();

    }


}