import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set2 = new TreeSet<>(Comparator.naturalOrder());
        int i=0;
        while (st.hasMoreTokens()) {
            int d = Integer.parseInt(st.nextToken());
            arr[i] = d;
            set2.add(d);
            i++;

        }
        set2.stream().sorted(Comparator.naturalOrder());
        i=0;
        for(int nn:set2){
            map.put(nn,i);
            i++;
        }
        for(i=0;i<arr.length;i++){
            bw.write(map.get(arr[i])+" ");
        }

        bw.close();


    }

}