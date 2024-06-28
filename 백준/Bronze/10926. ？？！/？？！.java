import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(st.nextToken()+"??!\n");
        bw.flush();
        bw.close();

    }
}