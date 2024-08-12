import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] number = new int[20000002];

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            int data = Integer.parseInt(st.nextToken());
            if(data>=0){
                data+=10000000;
            }
            else{
                data=Math.abs(data);
            }
            number[data]++;
        }
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        int i=0;
        while(st.hasMoreTokens()){
            int d = Integer.parseInt(st.nextToken());
            if(d>=0){
                d+=10000000;
            }
            else{
                d = Math.abs(d);
            }
            arr[i] = number[d];
            i++;
        }
        for(int z : arr)
            bw.write(z+" ");


        bw.close();
    }
}