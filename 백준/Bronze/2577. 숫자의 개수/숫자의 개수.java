import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int mul = a*b*c;
        int[] arr = new int[10];
        while(mul>0){
            arr[mul%10]++;
            mul/=10;
        }
        for(int data:arr){
            bw.write(data+"\n");
        }

        bw.close();
    }
}