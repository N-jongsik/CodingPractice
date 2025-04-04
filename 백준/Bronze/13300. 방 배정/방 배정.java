import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int [][] lst = new int[7][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());

            lst[grade][gender] += 1;
        }
        
        int room = 0;

        for(int i = 1; i <=6 ; i++){
            for(int j = 0; j < 2; j++){
                if(lst[i][j] % K != 0 && lst[i][j] != 0){
                    room += lst[i][j] / K +1;
                }else if(lst[i][j] % K == 0 && lst[i][j] != 0){
                    room += lst[i][j] / K;
                }
            }
        }
        System.out.println(room);
    }
}