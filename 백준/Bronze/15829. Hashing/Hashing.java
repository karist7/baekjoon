import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = 31;
        int M = 1234567891;

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long total=0;
        long power = 1;
        for(int i=0;i<L;i++){
            total = (total + (str.charAt(i)-'a'+1)*power);
            power = (power * r) % M;
        }

        bw.write(total%M+"\n");
        bw.close();
    }


}