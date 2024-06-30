import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (x<0 && y<0){
            bw.write(3+"\n");
        }
        else if(x>0 && y>0){
            bw.write(1+"\n");
        }
        else if (x>0 && y<0){
            bw.write(4+"\n");
        }
        else{
            bw.write(2+"\n");
        }

        bw.flush();
        bw.close();
    }
}