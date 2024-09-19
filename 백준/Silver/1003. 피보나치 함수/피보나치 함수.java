import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] zero= new int[42];

        zero[0] = 0;
        zero[1] = 0;
        zero[2] = 1;

        for(int i=3;i<42;i++){
            zero[i] = zero[i-1]+zero[i-2];
        }

        for(int i =0;i<n;i++){
            int d = Integer.parseInt(br.readLine());
            if(d==0){
                bw.write("1 0\n");
            }
            else if(d==1)
                bw.write("0 1\n");
            else{
                bw.write(zero[d]+" "+zero[d+1]+"\n");
            }

        }
        bw.close();
    }


}