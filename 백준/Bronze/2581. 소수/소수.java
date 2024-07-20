import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[100001];
        prime[0] = prime[1] = true;
        for(int i=2;i*i<prime.length;i++){
            if(!prime[i]){
                for(int j=i*i;j<prime.length;j+=i){
                    if(!prime[j])
                        prime[j]=true;
                }
            }
        }
        int total=0;
        int min=0;
        boolean flag=false;
        for(int i=m;i<=n;i++){
            if(!prime[i]){
                total+=i;
                if(flag==false){
                    flag=true;
                    min=i;
                }

            }

        }
        if(total!=0) {
            bw.write(total + "\n");
            bw.write(min + "\n");
        }
        else{
            bw.write(-1+"\n");
        }
        bw.close();
    }
}