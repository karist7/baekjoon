import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        for(int j=0;j<n;j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = 0;
            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                if (str.equals("add")) {
                    d = Integer.parseInt(st.nextToken());
                    set.add(d);
                } else if (str.equals("check")) {
                    d = Integer.parseInt(st.nextToken());
                    if (set.contains(d))
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                } else if (str.equals("remove")) {
                    d = Integer.parseInt(st.nextToken());
                    if (set.contains(d))
                        set.remove(d);
                } else if (str.equals("toggle")) {
                    d = Integer.parseInt(st.nextToken());
                    if (set.contains(d))
                        set.remove(d);
                    else
                        set.add(d);
                } else if (str.equals("all")) {
                    set.clear();
                    for (int i = 1; i <= 20; i++)
                        set.add(i);
                } else {
                    set.clear();
                }

            }
        }
        bw.close();
    }


}