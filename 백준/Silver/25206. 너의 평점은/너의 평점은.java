import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double total = 0;
        double avg = 0;
        double count=0;
        for(int i=0;i<20;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double gScore;
            if(grade.equals("A+")){
                gScore=4.5;
            }
            else if(grade.equals("A0")){
                gScore=4.0;
            }
            else if(grade.equals("B+")){
                gScore=3.5;
            }
            else if(grade.equals("B0")){
                gScore=3.0;
            }
            else if(grade.equals("C+")){
                gScore=2.5;
            }
            else if(grade.equals("C0")){
                gScore=2.0;
            }
            else if(grade.equals("D+")){
                gScore=1.5;
            }
            else if(grade.equals("D0")){
                gScore=1.0;
            }
            else if(grade.equals("P")){
                continue;
            }
            else{
                gScore=0.0;
            }
            total +=(gScore*score);
            count+=score;

        }
        avg = total/count;
        bw.write(String.format("%.4f",avg)+"\n");
        bw.close();
    }
}