import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        
        int count=0;
        int i;
        for(i=0;i<str.length();i++){
            
            for(String croatian : arr){
                if(i+croatian.length() <= str.length() && str.substring(i,i+croatian.length()).equals(croatian)){
                    i+=croatian.length()-1;
                    break;
                }
            }
            count+=1;

        }
        bw.write(count+"\n");
        bw.close();
    }

}