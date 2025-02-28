import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer N = Integer.parseInt(st.nextToken());
        Integer M = Integer.parseInt(st.nextToken());
        int [][] lst = new int[N][M];

        String str;

        for(int i = 0; i < N; i++){
            str = br.readLine();
            for(int j = 0; j < M; j++){
                lst[i][j] = str.charAt(j)-'0';
            }
        }

        int minNum = Math.min(N,M);

        while(true){
            for(int i = 0; i <= N-minNum; i++){
                for(int j = 0; j <= M-minNum; j++){
                    int k = lst[i][j];

                    if(k == lst[i][j+minNum-1] && k == lst[i+minNum-1][j] && k == lst[i+minNum-1][j+minNum-1]){
                        System.out.println(minNum*minNum);
                        return;
                    }
                }
            }
            minNum--;
        }
        

        
    }
}