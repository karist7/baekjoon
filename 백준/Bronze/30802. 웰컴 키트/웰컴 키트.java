import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        int i=0;
        while(st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int T=0;
        int P=0;
        for(int j=0;j<arr.length;j++){
            while(arr[j]>0){
                arr[j]-=t;
                T++;
            }

        }
        P=n/p;
        n%=p;
        bw.write(T+"\n");
        bw.write(P+" "+n+"\n");
        bw.close();
    }
}