import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());

        }
        
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                if(x[i]<x[j]&&y[i]<y[j])
                    count++;
            }
            bw.write(count+" ");
        }

        bw.close();
    }

}