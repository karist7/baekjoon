import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[15][15];
        for(int i=0;i<15;i++){
            arr[i][0] = 1;
            arr[0][i]=i+1;
        }
        for (int j=1;j<15;j++) {
            for (int k=1;k<15;k++) {
                arr[j][k] = arr[j-1][k] + arr[j][k-1];
            }
        }
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(arr[k][n-1]+"\n");

        }

        bw.close();

    }


}