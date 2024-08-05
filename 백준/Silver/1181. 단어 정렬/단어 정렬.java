import java.io.*;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = br.readLine();
        }
        arr = Arrays.stream(arr) .sorted(Comparator.comparingInt(String::length)
                .thenComparing(String::compareToIgnoreCase))
                .distinct()
                .toArray(String[]::new);
        for(String str:arr){
            bw.write(str+"\n");
        }
        bw.close();
    }
}