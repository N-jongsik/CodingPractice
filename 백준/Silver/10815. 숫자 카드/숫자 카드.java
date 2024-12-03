import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input," ");
        
        int [] lst = new int[n];

        int index = 0;
        while(st.hasMoreTokens()){
            lst[index++] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        String input2 = br.readLine();

        st = new StringTokenizer(input2," ");

        int [] arr = new int[m];
        
        index = 0;
        while(st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> set = new HashSet<>();

        for(int item: lst){
            set.add(item);
        }

        for(int num: arr){
            if(set.contains(num)){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
            System.out.print(" ");
        }
        
    }
}