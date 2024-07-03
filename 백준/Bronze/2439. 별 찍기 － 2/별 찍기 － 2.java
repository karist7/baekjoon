import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());



        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i,k,j;
        for(i=n;i>0;i--){
            for(k=1;k<i;k++){
                bw.write(" ");
            }
           for(j=k;j<=n;j++){
               bw.write("*");
           }
           bw.write("\n");
        }

        bw.close();
    }
}