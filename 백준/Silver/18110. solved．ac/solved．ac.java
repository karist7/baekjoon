import java.io.*;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        arr = Arrays.stream(arr).sorted().toArray();
        int s = (int) Math.round((n*0.15));
        int t = n-(s*2);
        int sum = Arrays.stream(Arrays.copyOfRange(arr,s,arr.length-s)).sum();

        bw.write(Math.round((double)sum/t)+"\n");
        bw.close();
    }
}