import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a,b;
        String input="";
        while((input=br.readLine())!=null){
            StringTokenizer st = new StringTokenizer(input);
            if(st.hasMoreTokens()){
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                bw.write(String.format("%d\n",a+b));
            }
            else
                break;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}