import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        int target = Integer.parseInt(br.readLine());
        long count = Arrays.stream(a)
                        .filter(num -> num==target)
                                .count();
        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}