import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = 0;
        int total=0;
        String str= br.readLine();
        for(int i=0;i<n;i++){
            m = Integer.parseInt(String.valueOf(str.charAt(i)));
            total+=m;
        }
        bw.write(total+"\n");
        bw.close();

    }
}