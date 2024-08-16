import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=0;i<n;i++)
            list.add(i+1);
        int d =0;
        while(list.size()!=1){
            d=(d+k-1)%list.size();
            sb.append(list.remove(d));
            sb.append(", ");
        }
        sb.append(list.remove()+">");
        bw.write(sb+"");
        bw.close();
    }
}