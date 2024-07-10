import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] bf = br.readLine().split(" ");
        int[] score = new int[n];
        for(int i=0;i<bf.length;i++){
            score[i] = Integer.parseInt(bf[i]);
        }
        OptionalInt maxScore = Arrays.stream(score).max();

        double[] fixScore = new double[n];

        for(int i=0;i<score.length;i++){
            fixScore[i] = ((double)score[i]/(maxScore.getAsInt()))*100;
        }
        OptionalDouble avg = Arrays.stream(fixScore).average();

        bw.write(avg.getAsDouble()+" ");
        bw.close();


    }
}