import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());

        String input2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(input2);
        int b = Integer.parseInt(st2.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(a*(b%10) +"\n");
        bw.write(a*((b/10)%10) +"\n");
        bw.write(a*((b/100)%10) +"\n");
        bw.write(a*b+"\n");
        bw.flush();
        bw.close();

    }
}