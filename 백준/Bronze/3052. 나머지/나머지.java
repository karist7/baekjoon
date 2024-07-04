import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];

        for(int i=0;i<arr.length;i++){
            int ans = (Integer.parseInt(br.readLine()))%42;
            arr[i]=ans;
        }
        int answer=0;
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                answer+=1;
            }


        }
        bw.write(answer+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}