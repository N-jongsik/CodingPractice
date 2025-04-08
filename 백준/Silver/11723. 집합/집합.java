import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if(cmd.equals("add")){
                set.add(Integer.parseInt(st.nextToken()));
            }else if(cmd.equals("remove")){
                set.remove(Integer.parseInt(st.nextToken()));
            }else if(cmd.equals("check")){
                int num = Integer.parseInt(st.nextToken());
                sb.append(set.contains(num) ? 1 : 0).append("\n");
            }else if(cmd.equals("empty")){
                set.clear();
            }else if(cmd.equals("all")){
                set.clear();
                for(int j = 1; j <= 20; j++){
                    set.add(j);
                }
            }else if(cmd.equals("toggle")){
                int num = Integer.parseInt(st.nextToken());
                if(set.contains(num)) set.remove(num);
                else set.add(num);
            }
        }
        System.out.println(sb);
    }
}
