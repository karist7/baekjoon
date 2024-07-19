import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] prime = new boolean[1001];
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i*i<prime.length;i++){
            if(!prime[i]){
                for(int j=i*i;j<prime.length;j+=i)
                    prime[j]=true;
            }
        }
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        while(st.hasMoreTokens()){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(!prime[arr.get(i)])
                count+=1;
        }

        bw.write(count+"\n");
        bw.close();
    }
}