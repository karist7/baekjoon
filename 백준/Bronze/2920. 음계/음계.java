import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] re_arr = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] num = new int[8];
        int i=0;
        while(st.hasMoreTokens()){
            num[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        if(Arrays.equals(num,arr))
            bw.write("ascending"+"\n");
        else if(Arrays.equals(num,re_arr))
            bw.write("descending"+"\n");
        else
            bw.write("mixed"+"\n");

        bw.close();
    }
}