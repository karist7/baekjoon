import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        str = str.toUpperCase();
        int[] alpha = new int[26];
        for(int i=0;i<str.length();i++){
            int idx = str.charAt(i)-'A';
            alpha[idx]++;
        }
        int maxValue=-1;
        char ch='?';
        for(int i=0;i<26;i++){
            if(maxValue<alpha[i]){
                maxValue=alpha[i];
                ch=(char)(i+'A');
            }
            else if(alpha[i]==maxValue)
                ch='?';
        }
        bw.write(ch+"\n");
        bw.close();
    }

}