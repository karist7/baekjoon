import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Character> arr = new ArrayList<>();
        int k = 0;
        boolean flag = false;
        for(int i=0;i<n;i++){
            int data = Integer.parseInt(br.readLine());
            if(list.size()==0){
                if(k>data){
                    flag=true;
                    break;
                }
                for(int j=k;j<data;j++){
                    k++;
                    list.add(k);
                    arr.add('+');
                }
                list.removeLast();
                arr.add('-');
            }
            else{
                if(list.peekLast() != null &&data<=list.peekLast()){
                    while(!list.isEmpty() &&data<=list.peekLast()){

                        list.removeLast();
                        arr.add('-');
                    }
                }
                else if(list.peekLast() != null && data>list.peekLast()) {
                    if(k>data){
                        flag=true;
                        break;
                    }

                    while (data > list.peekLast()) {
                        k++;
                        list.add(k);
                        arr.add('+');
                    }
                    list.removeLast();
                    arr.add('-');
                }
            }

        }
        if(!flag){
            for(char ch : arr)
                bw.write(ch+"\n");
        }
        else
            bw.write("NO"+"\n");
        bw.close();
    }
}