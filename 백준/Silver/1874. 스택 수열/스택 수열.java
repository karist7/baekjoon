import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int k = 0;
        boolean flag = false;
        for(int i=0;i<n;i++){
            int data = Integer.parseInt(br.readLine());
            if(data>k){
                for(int j=k+1;j<=data;j++){
                    list.add(j);
                    sb.append("+\n");
                }
                k=data;
            }
            if(list.get(list.size()-1)==data){
                list.removeLast();
                sb.append("-\n");
            }
        }
        if(list.isEmpty()){
            bw.write(sb+"\n");
        }
        else
            bw.write("NO"+"\n");
        bw.close();
    }
}