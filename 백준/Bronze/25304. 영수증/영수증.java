import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long sum = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());
        long total=0;
        for(int i=1;i<=n;i++){
           String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            total += (price*num);
        }
        if(total==sum)
            bw.write(String.format("Yes"));
        else
            bw.write(String.format("No"));
        bw.close();
    }
}