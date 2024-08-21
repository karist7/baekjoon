import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] board = new String[n];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine();
        }
        int sol=Integer.MAX_VALUE;
        for(int i=0;i<n-7;i++){
            for(int j=0;j<m-7;j++){
               int curSol = getSolution(i,j,board);
               if(sol > curSol)
                   sol=curSol;
            }
        }

        bw.write(sol+"\n");
        bw.close();
    }
    public static int getSolution(int startRow, int startCol, String[] board){
        String[] orgBoard = {"WBWBWBWB","BWBWBWBW"};
        int whiteSol = 0;
        for(int i=0;i<8;i++){
            int row = startRow + i;
            for(int j=0;j<8;j++){
                int col = startCol + j;
                if(board[row].charAt(col)!=orgBoard[row%2].charAt(j))
                    whiteSol++;
            }

        }
        return Math.min(whiteSol, 64 - whiteSol);

    }
}