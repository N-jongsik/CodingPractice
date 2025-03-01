import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int [] block = new int[W];
        int [] rain = new int[W];

        st = new StringTokenizer(br.readLine());

        int height = 0;
        int result = 0;

        for (int i = 0; i < W; i++){
            block[i] = Integer.parseInt(st.nextToken());
            height = Math.max(height, block[i]);
            rain[i] = height;
        }

        height = 0;

        //첫번째줄, 마지막줄 빗물 안고임
        for(int i = W-1; i >= 0 ; i--){
            height = Math.max(height,block[i]);
            rain[i] = Math.min(height, rain[i]);
            result += (rain[i] - block[i]);
        }
        
        System.out.println(result);
    }
}