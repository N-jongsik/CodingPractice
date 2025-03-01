import java.io.*;
import java.util.*;

public class Main{
    static int [][] lst = new int[101][101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        
        for(int i = 0; i < 4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L_X = Integer.parseInt(st.nextToken());
            int L_Y = Integer.parseInt(st.nextToken());
            int R_X = Integer.parseInt(st.nextToken());
            int R_Y = Integer.parseInt(st.nextToken());

            for(int j = L_Y; j < R_Y; j++){
                for(int k = L_X; k < R_X; k++){
                    if(lst[j][k] == 0){
                        lst[j][k] = 1;
                        sum+=1;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}