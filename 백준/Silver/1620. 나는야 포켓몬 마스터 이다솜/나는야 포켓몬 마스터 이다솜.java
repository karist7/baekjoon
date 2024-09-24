import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String str = br.readLine();
            map.put(str,i);
            arr.add(str);
        }
        for(int i=0;i<m;i++){
            String str = br.readLine();
            try{
                int d = Integer.parseInt(str);
                bw.write(arr.get(d-1)+"\n");

            }catch(Exception e){
                int data = map.get(str);
                bw.write(data+"\n");
            }

        }
        bw.close();
    }

}