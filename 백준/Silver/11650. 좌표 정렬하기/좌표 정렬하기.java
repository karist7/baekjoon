import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        class Coordinate{
            int x;
            int y;

            public Coordinate() {
                this.x=0;
                this.y=0;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Coordinate[] ct = new Coordinate[n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            ct[i] = new Coordinate();
            ct[i].setX(Integer.parseInt(st.nextToken()));
            ct[i].setY(Integer.parseInt(st.nextToken()));

        }
        ct = Arrays.stream(ct).sorted(Comparator.comparingInt(Coordinate::getX).thenComparing(Coordinate::getY)).toArray(Coordinate[]::new);
        for(Coordinate data : ct){
            bw.write(data.getX()+" "+data.getY()+"\n");
        }
        bw.close();
    }
}