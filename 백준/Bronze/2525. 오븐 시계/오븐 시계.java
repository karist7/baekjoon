import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int mm = Integer.parseInt(br.readLine());


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sm = m+mm;
        if(sm>=60){
            h+=(sm/60);
            sm%=60;

            if(h>=24)
                h-=24;
            bw.write(h + " " + sm + "\n");
        }

        else
            bw.write(h+" "+sm+"\n");
        bw.flush();
        bw.close();
    }
}