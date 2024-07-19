import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] prime = new boolean[1000001];
        prime[0]=true;
        prime[1]=true;

        for(int i=2;i*i<prime.length;i++){
            if(!prime[i]){
                for(int j=i*i;j<prime.length;j+=i) {
                    prime[j] = true;
                }
            }
        }


        int t = Integer.parseInt(br.readLine());
        int[] numbers = new int[t];
        for (int i = 0; i < t; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        
        for (int n : numbers) {
            int count = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (!prime[i] && !prime[n - i]) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }

        bw.close();
    }
}