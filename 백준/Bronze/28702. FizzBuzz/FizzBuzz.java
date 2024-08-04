import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<3;i++){
            String str = br.readLine();
            try{
                int a = Integer.parseInt(str);

                if(i==0){
                    bw.write(check(a+3)+"\n");
                    break;
                }
                else if(i==1){
                    bw.write(check(a+2)+"\n");
                    break;
                }
                else{
                    bw.write(check(a+1)+"\n");
                    break;
                }

            }
            catch (NumberFormatException e){
                continue;
            }
        }



        bw.close();

    }
    public static Object check(int n){
        if(n%3==0 && n%5==0)
            return "FizzBuzz";
        else if(n%3==0){
            return "Fizz";
        }
        else if(n%5==0){
            return "Buzz";
        }
        else{
            return n;
        }
    }


}