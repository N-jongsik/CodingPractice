import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == b && b == c && b == 0) break;

            int [] lst = {a,b,c};

            Arrays.sort(lst);

            if(lst[0] + lst[1] <= lst[2]){
                sb.append("Invalid").append("\n");
                continue;
            }

            Set<Integer> set = new HashSet<>();
            for(int num : lst) set.add(num);

            if(set.size() == 1){
                sb.append("Equilateral").append("\n");
            }else if(set.size() == 2){
                sb.append("Isosceles").append("\n");
            }else{
                sb.append("Scalene").append("\n");
            }
        }

        System.out.println(sb);
    }
}