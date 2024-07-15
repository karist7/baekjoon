import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int answer=0;
        int tmp=1;
        for(int i = str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if('A'<=ch && ch<='Z')
                answer+=(ch-'A'+10)*tmp;
            else{
                answer+=(ch-'0')*tmp;
            }
            tmp*=B;
        }
        bw.write(answer+"\n");
        bw.close();
    }

}