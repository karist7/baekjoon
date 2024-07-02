import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int nm = n/4;
        for(int i=0;i<nm;i++){
            bw.write(String.format("long "));
        }
        bw.write(String.format("int"));
        bw.close();
    }
}