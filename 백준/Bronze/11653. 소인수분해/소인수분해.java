import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=n; n>1; n+=0)
            for(int j=2; j<=n; j++) {
                if(n%j == 0) {
                    bw.write(j+"\n");
                    n /= j;
                    break;
                }

            }


        bw.close();
    }
}