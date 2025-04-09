import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            if(str.length() >= M){
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }

        List<String> lst = new ArrayList<>(map.keySet());

        Collections.sort(lst,(a,b)->{
            int valueA = map.get(a);
            int valueB = map.get(b);

            if(valueA == valueB){
                if(a.length() == b.length()){
                    return a.compareTo(b);
                }
                return b.length() - a.length();
            }
            return valueB - valueA;
        });

        StringBuilder sb = new StringBuilder();

        for(String item : lst){
            sb.append(item + "\n");
        }

        System.out.println(sb);
        
    }
}
