import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[n];
        int sum=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int data = Integer.parseInt(br.readLine());
            sum += data;
            arr[i] = data;
            map.put(data,map.getOrDefault(data,0)+1);
            if(data>max)
                max = data;
            if(data<min)
                min = data;
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(entries);

        entryList.sort(Map.Entry.<Integer,Integer>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey()));
        int m = entryList.get(0).getValue();

        arr = Arrays.stream(arr).sorted().toArray();
        double avg = (double)sum/n;
        bw.write(Math.round(avg)+"\n");
        bw.write(arr[arr.length/2]+"\n");
        
        
        int mode = entryList.get(0).getKey();
        if (entryList.size() > 1 && entryList.get(0).getValue().equals(entryList.get(1).getValue())) {
            mode = entryList.get(1).getKey();
        }
        
        bw.write(mode + "\n");
        bw.write((max-min)+"\n");

        bw.close();
    }
}