import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = 31;
        int M = 1234567891;

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int total=0;
        for(int i=0;i<L;i++){
            total+= (int) (((str.charAt(i)-'a'+1)*(Math.pow(r,i)))%M);
        }

        bw.write(total+"\n");
        bw.close();
    }


}