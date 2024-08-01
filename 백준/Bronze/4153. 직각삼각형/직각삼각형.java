import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0)
                break;
            if(a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b)
                bw.write("right"+"\n");
            else
                bw.write("wrong"+"\n");
        }
        bw.close();
    }
}