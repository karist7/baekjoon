import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int a, b, c;

        String str="";
        for(int i=0;i<m;i++){
            str = br.readLine();
            st = new StringTokenizer(str);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            for(int j=a-1;j<b;j++){
                arr[j]=c;
            }
        }
        for(int i=0;i<arr.length;i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}