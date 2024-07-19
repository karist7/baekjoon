import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] prime = new boolean[123456*2+1];
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i*i<prime.length;i++){
            if(!prime[i]){
                for(int j=i*i;j<prime.length;j+=i)
                    prime[j]=true;
            }
        }
        int count=0;
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0)
                break;
            for(int i=n+1;i<=n*2;i++) {
                if (!prime[i]) {
                    count += 1;
                }
            }
            bw.write(count+"\n");
            count=0;
        }


        bw.close();
    }
}