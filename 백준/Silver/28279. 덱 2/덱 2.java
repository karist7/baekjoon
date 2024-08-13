import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            switch (d){
                case 1:
                    list.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    list.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(list.size()==0)
                        bw.write(-1+"\n");
                    else
                        bw.write(list.pollFirst()+"\n");
                    break;
                case 4:
                    if(list.size()==0)
                        bw.write(-1+"\n");
                    else
                        bw.write(list.pollLast()+"\n");
                    break;
                case 5:
                    bw.write(list.size()+"\n");
                    break;
                case 6:
                    if(list.isEmpty())
                        bw.write(1+"\n");
                    else
                        bw.write(0+"\n");
                    break;
                case 7:
                    if(list.size()!=0)
                        bw.write(list.peekFirst()+"\n");
                    else
                        bw.write(-1+"\n");
                    break;
                case 8:
                    if(list.size()!=0)
                        bw.write(list.peekLast()+"\n");
                    else
                        bw.write(-1+"\n");
                    break;
            }
        }

        bw.close();
    }
}