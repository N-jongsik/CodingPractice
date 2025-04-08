import java.io.*;
import java.util.*;

public class Main{
    static int N;
    static int [][] lst;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        lst = new int[N][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            lst[i][0] = Integer.parseInt(st.nextToken());
            lst[i][1] = Integer.parseInt(st.nextToken());
        }

        int minNum = Integer.MAX_VALUE;

        if(K == 1){
            for(int i = 0; i < N; i++){
                minNum = Math.min(minNum,cal(i,i,i));
            }
        }else if(K == 2){
            for(int i = 0; i < N-1; i++){
                for(int j = i+1; j < N; j++){
                    minNum = Math.min(minNum,cal(i,j,j));
                }
            }
        }else{
            for(int i = 0; i < N-2; i++){
                for(int j = i+1; j < N-1; j++){
                    for(int k = i+2; k < N; k++){
                        minNum = Math.min(minNum,cal(i,j,k));
                    }
                }
            }
        }

        System.out.println(minNum);
    }

    public static int cal(int a, int b, int c){
        int answer = 0;

        for(int i = 0; i < N; i++){
            int temp1 = Math.abs(lst[i][0] - lst[a][0]) + Math.abs(lst[i][1] - lst[a][1]);
            int temp2 = Math.abs(lst[i][0] - lst[b][0]) + Math.abs(lst[i][1] - lst[b][1]);
            int temp3 = Math.abs(lst[i][0] - lst[c][0]) + Math.abs(lst[i][1] - lst[c][1]);
            
            answer = Math.max(answer,Math.min(temp1,Math.min(temp2,temp3)));
        }
        return answer;
    }
}
