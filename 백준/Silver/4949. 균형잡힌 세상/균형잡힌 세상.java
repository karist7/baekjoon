import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        boolean flag;
        while(true){
            flag = false;
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }

            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch=='[' || ch=='('){
                    stack.push(ch);
                }
                else if(ch==']'){
                    if(stack.isEmpty() || stack.pop()!='[') {
                        flag = true;
                        break;
                    }
                }
                else if(ch==')'){
                    if(stack.isEmpty() || stack.pop()!='(') {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag || !stack.isEmpty())
                bw.write("no"+"\n");
            else
                bw.write("yes"+"\n");
            stack.clear();
        }
        bw.close();
    }
}