import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean flag=false;
        int a=0,b=0,c=0,di=1;
        for(int i=1;i<=1000000;i++){
            flag = false;
            a = 0;
            b = i;
            c = 0;
            di=1;
            while(b>0){
                a+=(b%10);
                c+=((b%10)*di);
                b/=10;
                di*=10;
            }
            if(c+a==n){
                flag=true;
                break;
            }
        }
        if(flag){
            bw.write(c+"\n");
        }
        else{
            bw.write(0+"\n");
        }
        bw.close();
    }
}