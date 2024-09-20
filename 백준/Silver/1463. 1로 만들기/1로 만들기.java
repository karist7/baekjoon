import java.io.*;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count=0;
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        boolean flag =false;
        list.add(n);
        while(true){

            if(list.contains(1))
                break;
            while(!list.isEmpty()){
                int d = list.poll();
                if(d%3==0)
                    list2.add(d/3);
                if(d%2==0)
                    list2.add(d/2);
                list2.add(d-1);

            }

            while(!list2.isEmpty()){
                int k = list2.poll();
                if(k==1) {
                    flag = true;
                    break;
                }
                list.add(k);
            }
            count+=1;
            if(flag)
                break;

        }


        bw.write(count+"\n");
        bw.close();
    }


}