import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] token = str.strip().split(" ");
        if(str.equals(" ")){
            bw.write(0+"\n");
        }
        else
            bw.write(token.length+"\n");

        bw.close();

    }
}