import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long max = 0;
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i])
                max = arr[i];
        }
        max++;
        long min=0;
        long mid=0;
        while(min < max){
            mid = (max+min)/2;
            long count=0;
            for(int i=0;i<arr.length;i++)
                count+=(arr[i]/mid);
            if(count<n)
                max=mid;
            else
                min = mid+1;
        }
        bw.write(min-1+"\n");
        bw.close();
    }

}