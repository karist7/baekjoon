import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> arr = new ArrayList<>();
        arr.add("ABC");
        arr.add("DEF");
        arr.add("GHI");
        arr.add("JKL");
        arr.add("MNO");
        arr.add("PQRS");
        arr.add("TUV");
        arr.add("WXYZ");
        String str = br.readLine();
        int total = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            for(int j=0;j<arr.size();j++){
                if(arr.get(j).contains(String.valueOf(ch))){
                    total+=(j+3);
                    break;
                }
            }
        }
        bw.write(total+"\n");
        bw.close();
    }

}