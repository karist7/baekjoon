import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int max=-1;
        int n = 0,m = 0;
        for(int i=0;i<9;i++){
            st = new StringTokenizer(br.readLine());
            int j=1;
            while(st.hasMoreTokens()){
                int num = Integer.parseInt(st.nextToken());
                if(max<num){
                    max = num;
                    n=i+1;
                    m=j;
                }
                j+=1;
            }
        }
        bw.write(String.format("%d\n%d %d",max,n,m));
        bw.close();
    }

}