import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum=0;
        if(a==b){
            if(b==c)
                sum=10000+a*1000;
            else
                sum=1000+a*100;
        }
        else if(a==c)
            sum=1000+a*100;

        else if(b==c)
            sum=1000+b*100;
        else
            sum=Math.max(Math.max(a,b),c)*100;
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
    }
}