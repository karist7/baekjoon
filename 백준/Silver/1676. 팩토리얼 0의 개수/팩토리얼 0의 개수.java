import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger[] arr = new BigInteger[501];
        arr[0]= BigInteger.valueOf(1);
        arr[1]= BigInteger.valueOf(1);

        for(int i=2;i<501;i++){
            arr[i] = arr[i-1].multiply(BigInteger.valueOf(i));

        }

        int n = Integer.parseInt(br.readLine());
        String str = String.valueOf(arr[n]);
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            
            if(str.charAt(i)=='0') {
                count++;
            }
            else{
                break;
            }
        }
        bw.write(count+"\n");
        bw.close();
    }
}