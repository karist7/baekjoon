import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] answer = {1, 1, 2, 2, 2, 8};
        int[] sub = new int[6];
        
        String[] ary = br.readLine().split(" ");
        for(int i=0;i<ary.length;i++) {
            sub[i] = Integer.parseInt(ary[i]);
            answer[i] -= sub[i];
        }
        for(int i=0;i<answer.length;i++){
            bw.write(answer[i]+" ");   
        }
        bw.close();
    }

}