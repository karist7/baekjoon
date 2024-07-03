import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a,b;
        while(true) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0)
                break;
            bw.write(String.format("%d\n", a + b));

        }
        bw.close();
    }
}