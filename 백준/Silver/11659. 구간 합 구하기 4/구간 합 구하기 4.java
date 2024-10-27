import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        int i=0;
        while(st.hasMoreTokens()){
            if(i==0)
                arr[i] = Integer.parseInt(st.nextToken());
            else
                arr[i] = Integer.parseInt(st.nextToken())+arr[i-1];
            i++;
        }
     
        
        for(int j=0;j<m;j++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int total=0;
            if(a-2>=0)
                total=arr[b-1] - arr[a-2];
            else
                total = arr[b - 1];

            bw.write(total+"\n");
        }

        bw.close();
    }
}