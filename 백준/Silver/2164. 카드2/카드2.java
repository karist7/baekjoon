import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=n;i>0;i--){
            list.add(i);
        }

        
        while(list.size()!=1){
            list.removeLast();
            list.addFirst(list.removeLast());

        }
        bw.write(list.peek()+"\n");
        bw.close();
    }
}