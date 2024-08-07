import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if(str.equals("push")){
                list.add(Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("pop")){
                if(list.size()==0)
                    bw.write(-1+"\n");
                else
                    bw.write(list.removeFirst()+"\n");

            }
            else if(str.equals("front")){
                if(list.size()==0)
                    bw.write(-1+"\n");
                else
                    bw.write(list.peek()+"\n");

            }
            else if(str.equals("back")){
                if(list.size()==0)
                    bw.write(-1+"\n");
                else
                    bw.write(list.peekLast()+"\n");

            }
            else if(str.equals("size")){
                bw.write(list.size()+"\n");
            }
            else if(str.equals("empty")){
                if(list.size()==0)
                    bw.write(1+"\n");
                else
                    bw.write(0+"\n");
            }

        }

        bw.close();
    }
}