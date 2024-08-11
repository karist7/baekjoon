import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        boolean flag;
        for(int i=0;i<n;i++){
            flag=false;
            String str = br.readLine();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='(')
                    stack.push('(');
                else{
                    if(stack.empty()){
                        flag=true;
                        break;
                    }
                    else{
                        stack.pop();
                    }

                }
            }
            if(!flag && stack.isEmpty())
                bw.write("YES\n");
            else
                bw.write("NO\n");
            stack.clear();
        }

        bw.close();
    }
}