import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] left = new int[N];
        int [] line = new int[N];

        for(int i = 0; i < N; i++){
            left[i] = Integer.parseInt(st.nextToken());

        }

        for(int i = 0; i < N; i++){
            int count = left[i];

            for(int j = 0; j < N; j++){
                if(line[j] == 0){
                    if(count == 0){
                        line[j] = i+1;
                        break;
                    }else{
                        count --;
                    }
                }
            }
        }
        
        for(int item : line){
            System.out.print(item +" ");
        }
        
    }
}
