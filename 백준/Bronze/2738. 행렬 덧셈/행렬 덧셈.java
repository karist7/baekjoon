import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] total = new int[n][m];
        for(int i=0;i<n;i++){
            String str = br.readLine();
            st = new StringTokenizer(str);
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }

        }
        for(int i=0;i<n;i++){
            String str = br.readLine();
            st = new StringTokenizer(str);
            for(int j=0;j<m;j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }


        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                total[i][j] = arr[i][j] + arr2[i][j];
                bw.write(total[i][j]+" ");
            }
            bw.write("\n");
        }

        bw.close();
    }

}