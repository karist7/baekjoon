import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int g = gcd(n,m);
        bw.write(g+"\n");
        bw.write(((n*m)/g)+"\n");
        bw.close();

    }
    public static int gcd(int a, int b){

        if(b<=0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}