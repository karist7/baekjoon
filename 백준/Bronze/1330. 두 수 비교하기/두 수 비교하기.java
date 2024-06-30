import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if (a<b)
            bw.write("<"+"\n");
        else if(a>b)
            bw.write(">"+"\n");
        else
            bw.write("=="+"\n");
        bw.flush();
        bw.close();
    }
}