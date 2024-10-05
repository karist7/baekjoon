import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] A = new int[n];
        int[] arr = new int[100000001];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.MAX_VALUE;
        }
        arr[0] = 0;
        for(int i=0;i<n;i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<A.length;j++){
               if(i>=A[j]){
                    arr[i] = Math.min(arr[i],arr[i-A[j]]+1);
               }
               else{
                   break;
               }
            }
        }
        bw.write(arr[k]+"\n");

        bw.close();


    }

}