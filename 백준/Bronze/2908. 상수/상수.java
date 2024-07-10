import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] a = st.nextToken().toCharArray();
        char[] b = st.nextToken().toCharArray();

        String str1 = swap(a);
        String str2 = swap(b);
        if(Integer.parseInt(str1)>Integer.parseInt(str2))
            bw.write(str1+"\n");
        else
            bw.write(str2+"\n");
        bw.close();

    }
    static String swap(char[] a){
        char temp = a[0];
        a[0] = a[2];
        a[2] = temp;

        String sa = "";
        for(int i=0;i<a.length;i++)
            sa = sa.concat(String.valueOf(a[i]));
        return sa;
    }

}