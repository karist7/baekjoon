import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i;
        Set<Integer> set = new HashSet<>();

        while(st.hasMoreTokens()){
            set.add(Integer.parseInt(st.nextToken()));
        }


        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr2 = new int[m];
          i=0;
        while(st.hasMoreTokens()){
            arr2[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        for(int a : arr2){
            if(set.contains(a))
                bw.write("1\n");
            else
                bw.write("0\n");
        }


        bw.close();
    }
}