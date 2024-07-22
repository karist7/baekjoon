import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] prime = new boolean[10000001];
        prime[0]=true;
        prime[1]=true;

        for(int i=2;i*i<prime.length;i++){
            if(!prime[i]){

                for(int j=i*i;j<prime.length;j+=i) {
                    prime[j] = true;
                }
            }
        }
        int n = Integer.parseInt(br.readLine());
        int j=2;
        double p = 0;
        while(true){
            if(n==1)
                break;
            if(!prime[j])
                p = (double) n /j;
            if(p==1.0){
                bw.write(j+"\n");
                break;
            }
            if(p!=(int)p){
                j+=1;
            }
            else{
                bw.write(j+"\n");
                n/=j;
            }

        }

        bw.close();
    }
}