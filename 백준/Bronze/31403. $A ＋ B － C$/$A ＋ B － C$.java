import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        bw.write((a+b-c)+"\n");

        String ab = String.valueOf(a)+ String.valueOf(b);
        bw.write((Integer.parseInt(ab)-c)+"\n");
        bw.close();
    }
}