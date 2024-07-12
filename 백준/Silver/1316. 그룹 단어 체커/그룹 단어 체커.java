import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        boolean flag;
        for(int i=0;i<n;i++){
            String str = br.readLine();
            flag=true;
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                if(map.containsKey(ch)){
                    if(j>=1 && str.charAt(j-1)==ch){
                        continue;
                    }
                    else{

                        flag=false;
                        break;
                    }
                }
                else{
                    map.put(ch,1);
                }
            }
            if(flag)
                count+=1;
            map.clear();
        }
        bw.write(count+"\n");


        bw.close();
    }

}