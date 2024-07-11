import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        str = str.toUpperCase();
        Map<Character,Integer> map = new HashMap<>();
        int t=0;
        for(int i=0;i<str.length();i++) {
            if (map.containsKey(str.charAt(i))) {
                t = map.get(str.charAt(i));
                t += 1;
                map.put(str.charAt(i), t);
            } else {
                map.put(str.charAt(i), 1);
            }

        }
        Optional<Integer> answer = map.values().stream().max(Comparator.naturalOrder());
        int maxNum=0;
        if(answer.isPresent()){
           maxNum = answer.get();
        }
        boolean flag = false;
        Set<Character> keys = map.keySet();
        char ans = 0;
        for(char key : keys){
            if(maxNum == map.get(key)){
                if(ans == 0)
                    ans = key;
                else {
                    flag = true;
                    break;
                }
            }
        }
        if(flag)
            bw.write("?"+"\n");
        else
            bw.write(ans+"\n");
        bw.close();
    }

}