import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<k;i++){
            int d = Integer.parseInt(br.readLine());
            if(d==0)
                stack.pop();
            else{
                stack.push(d);
            }
        }
        int total=0;
        for(int n : stack)
            total+=n;
        bw.write(total+"\n");
        bw.close();
    }
}