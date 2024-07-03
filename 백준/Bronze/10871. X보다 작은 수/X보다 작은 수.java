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
        String str = br.readLine();
        st = new StringTokenizer(str);

        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr = Arrays.stream(a)
                        .filter(num -> num<m)
                                .toArray();
        for(int i=0;i<arr.length;i++)
            bw.write(arr[i] +" ");

        bw.flush();
        bw.close();
        br.close();
    }
}