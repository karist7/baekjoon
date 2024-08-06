import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] prime = new boolean[1000001];
        prime[0] = true;
        prime[1] = true;
        for(int i=2;i*i<prime.length;i++){
            if(!prime[i]){
                for(int j=i*i;j<prime.length;j+=i){
                    prime[j]=true;
                }
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=n;i<=m;i++){
            if(!prime[i])
                bw.write(i+"\n");
        }

        bw.close();
    }
}