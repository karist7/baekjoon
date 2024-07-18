import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for(int i=1;i<=n;i++){
            if(n%i==0)
                arr.add(i);
        }
        if(arr.size()<k){
            bw.write(0+"\n");
        }
        else{
            bw.write(arr.get(k-1)+"\n");
        }




        bw.close();
    }
}