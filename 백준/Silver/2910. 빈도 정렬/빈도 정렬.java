import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new LinkedHashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken()); 
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        List<Integer> lst = new ArrayList<>(map.keySet());

        Collections.sort(lst, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){

                return Integer.compare(map.get(b), map.get(a));
            }
        } );

        Iterator<Integer> it = lst.iterator();
        while (it.hasNext()) {
            Integer element = it.next();
            for(int i=0; i<map.get(element); i++){
                sb.append(element+" ");    
            }

        }
        System.out.println(sb);        
    }
}
