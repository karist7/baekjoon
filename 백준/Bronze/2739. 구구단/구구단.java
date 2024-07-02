import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1;i<10;i++){
            String formattedString = String.format("%d * %d = %d\n",n,i,n*i);
            bw.write(formattedString);
        }
        bw.flush();
        bw.close();
    }
}