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
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        int max=0;
        int data=0;
        boolean flag=false;
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                for(int l=k+1;l<arr.length;l++){
                    data = arr[k]+arr[j]+arr[l];
                    if(max<data && data<=m)
                        max = data;
                    if(data==m) {
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;

            }
            if(flag)
                break;
        }
        bw.write(max+"\n");
        bw.close();
    }
}