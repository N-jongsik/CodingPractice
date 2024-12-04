import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int [] lst = new int[n];

        for(int i = 0; i<n; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(lst);

        int start = 0;
        int end = n-1;

        int cnt = 0;

        while(start < end){
            if((lst[start] + lst[end]) == x){
                cnt++;
                start++;
                end--;
            }else if((lst[start] + lst[end]) < x){
                start++;
            }else{
                end--;
            }
            
        }
        System.out.println(cnt);
    }
}