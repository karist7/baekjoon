import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = i+1;
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int[] subArray = Arrays.copyOfRange(arr, a-1, b);
            Integer[] tmp = Arrays.stream(subArray).boxed().toArray(Integer[]::new);
            List<Integer> list = Arrays.asList(tmp);
            Collections.reverse(list);
            Integer[] reverseArr = list.toArray(tmp);
            int k=0;
            for(int j=a-1;j<b;j++){
                arr[j] = reverseArr[k];
                k+=1;
            }

        }
        for(int i=0;i<arr.length;i++){
            bw.write(arr[i]+ " ");
        }
        bw.close();
    }
}