import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total=0;
        while(st.hasMoreTokens()){
            int n = Integer.parseInt(st.nextToken());
            n*=n;
            total+=n;
        }


        bw.write(total%10+"\n");
        bw.close();
    }
}