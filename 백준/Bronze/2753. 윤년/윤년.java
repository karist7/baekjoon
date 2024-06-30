import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int a = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if(a%4==0 && (a%100!=0 || a%400==0))
            bw.write(1 + "\n");
        else
            bw.write(0 + "\n");
        bw.flush();
        bw.close();
    }
}