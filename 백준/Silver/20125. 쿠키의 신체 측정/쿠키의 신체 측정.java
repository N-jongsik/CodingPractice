import java.io.*;
import java.util.*;

public class Main{
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};

    static int N;
    static char [][] board;
    static int x, y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        board = new char [N][N];
        List<int[]> lst = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++){
                board[i][j] = str.charAt(j);

                if(board[i][j] == '*'){
                    lst.add(new int [] {i,j});
                }
            }
        }

        // 심장 위치
        for(int [] item : lst){
            if(heart(item)){
                x = item[0];
                y = item[1];
            }
        }

        sb.append((x+1) + " " + (y+1) + "\n");

        //왼쪽 팔
        int leftArm = 0;
        int n1 = x;
        int n2 = y-1;

        while(range(new int [] {n1,n2}) && board[n1][n2] == '*'){
            leftArm ++;
            n2--;
        }

        sb.append(leftArm + " ");

        //오른쪽 팔
        int rightArm = 0;
        n1 = x;
        n2 = y+1;

        while(range(new int [] {n1,n2}) && board[n1][n2] == '*'){
            rightArm ++;
            n2 ++;
        }

        sb.append(rightArm + " ");

        //허리
        int waist = 0;
        n1 = x+1;
        n2 = y;

        while(range(new int [] {n1,n2}) && board[n1][n2] == '*'){
            waist ++;
            n1 ++;
        }

        sb.append(waist + " ");

        //왼쪽 다리
        int leftLeg = 0;
        n1 = x + waist +1;
        n2 = y-1;

        while(range(new int [] {n1,n2}) && board[n1][n2] == '*'){
            leftLeg ++;
            n1 ++;
        }

        sb.append(leftLeg + " ");

        //오른쪽 다리
        int rightLeg = 0;
        n1 = x + waist + 1;
        n2 = y+1;

        while(range(new int [] {n1,n2}) && board[n1][n2] == '*'){
            rightLeg ++;
            n1 ++;
        }

        sb.append(rightLeg);

        System.out.println(sb);
    }
    public static boolean heart(int [] item){
        for(int i = 0; i < 4; i++){
            int nx = item[0] + dx[i];
            int ny = item[1] + dy[i];

            if(!range(new int [] {nx,ny})){
                return false;
            }

            if(board[nx][ny] != '*'){
                return false;
            }
        }

        return true;
    }

    public static boolean range(int [] loc){
        return loc[0]>=0 && loc[0]<N && loc[1]>=0 && loc[1]<N;
    }
}
