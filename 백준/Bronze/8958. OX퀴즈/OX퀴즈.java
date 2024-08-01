import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String str = br.readLine();
            int count = 0;
            int total=0;
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                if(ch=='O'){
                    count+=1;
                    total+=count;
                }
                else{
                    count=0;
                }
            }
            bw.write(total+"\n");
        }



        bw.close();
    }
}