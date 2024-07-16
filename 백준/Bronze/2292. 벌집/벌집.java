import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        int r = 6;
        int count=1;
        while(n>1){
            n-=r;
            r+=6;
            count+=1;

        }
        bw.write(count+"\n");

        bw.close();
    }
}
