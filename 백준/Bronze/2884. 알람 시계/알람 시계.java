import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sm = m-45;

        if(sm>=0){
            bw.write(h + " " +  sm +"\n");
        }
        else{
            h-=1;
            sm+=60;
            if(h>=0){
                bw.write(h + " " +  sm +"\n");
            }
            else{
                h=23;
                bw.write(h + " " +  sm +"\n");
            }

        }
        bw.flush();
        bw.close();
    }
}