import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String input2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(input2," ");

        int [] lst = new int[N];
        int index = 0;

        while(st2.hasMoreTokens()){
            lst[index++] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(lst);

        int start = 0;
        int end = lst[N - 1];
        int result = 0;

        while(start <= end){
            int mid = (start+end)/2;
            long total = 0;
            for(int item: lst){
                if(item > mid){
                    total += item-mid;
                }
            }
            if(total >= M){
                result = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(result);
    }
}