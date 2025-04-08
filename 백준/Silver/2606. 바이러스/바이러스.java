import java.io.*;
import java.util.*;

public class Main{
    static boolean [] visited;
    static List<List<Integer>> lst;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        lst = new ArrayList<>();

        for(int i = 0; i <= N; i++){
            lst.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            lst.get(a).add(b);
            lst.get(b).add(a);
        }

        visited = new boolean[N+1];

        dfs(1);

        System.out.println(answer -1);
    }
    public static void dfs(int num){
        visited[num] = true;
        answer ++;
        for(int next : lst.get(num)){
            if(!visited[next]){
                visited[next] = true;
                dfs(next);
            }
        }
    }
}
