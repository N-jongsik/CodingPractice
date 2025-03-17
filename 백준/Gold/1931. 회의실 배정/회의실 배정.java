import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<int []> lst = new ArrayList<>();


        for(int i = 0; i < N; i++){
            StringTokenizer st  = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            lst.add(new int[] {start,end});
        }

        lst.sort((a,b) -> {
            if(a[1] == b[1]){
                return Integer.compare(a[0],b[0]);
            }else{
                return Integer.compare(a[1],b[1]);
            }
        });

        int lastEndTime = 0;
        int count = 0;

        for(int [] item : lst){
            int start = item[0];
            int end = item[1];

            if(start >= lastEndTime){
                count ++;
                lastEndTime = end;
            }
        }
        
        System.out.println(count);
    }
}