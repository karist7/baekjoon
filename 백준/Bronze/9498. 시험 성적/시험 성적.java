import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);

        int a = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if (a>=90)
            bw.write("A"+"\n");
        else if(a>=80)
            bw.write("B"+"\n");
        else if(a>=70)
            bw.write("C"+"\n");
        else if(a>=60)
            bw.write("D"+"\n");
        else
            bw.write("F"+"\n");
        bw.flush();
        bw.close();
    }
}