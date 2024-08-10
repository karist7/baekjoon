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
            int a = Integer.parseInt(st.nextToken());

            if(a==1){
                list.add(Integer.parseInt(st.nextToken()));
            }
            else if(a==2){
                if(list.size()==0)
                    bw.write(-1+"\n");
                else
                    bw.write(list.removeLast()+"\n");

            }
            else if(a==5){
                if(list.size()==0)
                    bw.write(-1+"\n");
                else
                    bw.write(list.peekLast()+"\n");

            }
            else if(a==3){
                bw.write(list.size()+"\n");
            }
            else if(a==4){
                if(list.size()==0)
                    bw.write(1+"\n");
                else
                    bw.write(0+"\n");
            }

        }

        bw.close();
    }
}