import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int dot = 2;
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            dot+=(dot-1);
        }
        bw.write(dot*dot+"\n");

        bw.close();
    }
}
