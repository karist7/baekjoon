import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] coin = new int[4];
        int[] remain = {25, 10, 5, 1};
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            int j=0;
            while(n>0){
                coin[j] = n/remain[j];
                n%=remain[j];

                j+=1;
            }
            for(int k=0;k<coin.length;k++){
                bw.write(coin[k]+" ");
                coin[k]=0;
            }
            bw.write("\n");
        }
        bw.close();
    }
}
