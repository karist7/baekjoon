import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m=0;
        String str="";
        for(int i=0;i<n;i++){
            int k=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            for(int l=0;l<str.length();l++) {
                for (int j = 0; j < m; j++) {
                    bw.write(str.charAt(k) + "");
                }
                k+=1;
            }
            bw.write("\n");
        }

        bw.close();

    }
}