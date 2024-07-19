import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();


        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==-1)
                break;
            int total=0;
            for(int i=1;i<n;i++){
                if(n%i==0) {
                    arr.add(i);
                    total += i;
                }
            }
            if(total==n){
                bw.write(String.format("%d = ",n));
                for(int j = 0;j<arr.size()-1;j++)
                    bw.write(String.format("%d + ",arr.get(j)));
                bw.write(arr.get(arr.size()-1)+"\n");
            }
            else{
                bw.write(String.format("%d is NOT perfect.\n",n));
            }
            arr.clear();

        }





        bw.close();
    }
}