import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int h,w,n;
        int r;
        int d;
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            r=101;
            d=1;
            for(int j=0;j<n;j++){
                if(r>h*100+d){
                    r=101;
                    r+=d;
                    d+=1;
                }
                
                r+=100;
            }
            bw.write(r-100+"\n");
        }



        bw.close();
    }
}