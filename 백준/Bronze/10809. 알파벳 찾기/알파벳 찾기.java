import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int[] arr= new int[26];
        int num=0;
        boolean flag;
        for(int i=0;i< alpha.length();i++){
            flag=false;
            for(int j=0;j<str.length();j++){
                if(alpha.charAt(i)==str.charAt(j)){
                    flag=true;
                    num=j;
                    break;
                }
            }
            if(flag){
                arr[i]=num;
            }
            else
                arr[i]=-1;
        }
        for(int i=0;i<arr.length;i++){
            bw.write(arr[i]+ " ");
        }
        bw.close();

    }
}