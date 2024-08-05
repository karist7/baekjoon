import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count=0;
        int i=666;

        while(count!=n){
            String str = String.valueOf(i);

            if(str.contains("666")) {
                count++;
            }

            i++;

        }
        bw.write(i-1+"\n");
        bw.close();
    }
}