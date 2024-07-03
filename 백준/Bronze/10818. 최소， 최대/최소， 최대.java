import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        st = new StringTokenizer(str);
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
            if(a[i]<min)
                min=a[i];
            if(a[i]>max)
                max=a[i];

        }
        bw.write(min + " " + max);


        bw.flush();
        bw.close();
        br.close();
    }
}