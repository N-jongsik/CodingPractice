import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] lst = new int[N];

        for(int i = 0; i < N; i++){
            lst[i] = Integer.parseInt(st.nextToken());
        }

        HashSet<Integer> set = new HashSet<>();

        for(int item : lst){
            set.add(item);
        }

        List<Integer> sorted_lst = new ArrayList<>(set);

        Collections.sort(sorted_lst);

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < sorted_lst.size(); i++){
            map.put(sorted_lst.get(i),i);
        }

        StringBuilder sb = new StringBuilder();

        for(int item : lst){
            sb.append(map.get(item)).append(" ");
        }

        System.out.println(sb);
    }
}