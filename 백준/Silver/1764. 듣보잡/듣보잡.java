import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<String> arr = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(br.readLine());
        }
        int k=0;
        for(int i=0;i<m;i++){
            String str = br.readLine();
            if(set.contains(str)){
                arr.add(str);
                k+=1;
            }
        }
        bw.write(k+"\n");
        arr.sort(String::compareTo);
        for(String s : arr){
            bw.write(s+"\n");
        }
        bw.close();
    }


}