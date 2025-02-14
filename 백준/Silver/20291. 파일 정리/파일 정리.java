import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String,Integer> map = new HashMap<>();
        List<String> lst = new ArrayList<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),".");
            st.nextToken();
            String str = st.nextToken();
            if(!map.containsKey(str)){
                lst.add(str);
            }
            map.put(str,(map.getOrDefault(str,0)+1));
        }

        StringBuilder sb = new StringBuilder();

        Collections.sort(lst);

        for(String item:lst){
            sb.append(item).append(" ").append(map.get(item)).append("\n");
        }
        
        System.out.println(sb);
    }
}