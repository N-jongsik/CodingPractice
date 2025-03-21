import java.io.*;
import java.util.*;

public class Main{
    static boolean [] visited;
    static int [] dist;
    static List<List<Integer>> lst;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        lst = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            lst.add(new ArrayList<>());
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            lst.get(x).add(y);
            lst.get(y).add(x);
        }

        visited = new boolean[n+1];
        dist = new int[n+1];

        int result = bfs(a,b);
        System.out.println(result);
    }

    static public int bfs(int start, int end){
        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int cur = q.poll();

            for(int next : lst.get(cur)){
                if(!visited[next]){
                    visited[next] = true;
                    dist[next] = dist[cur] + 1;
                    q.offer(next);

                    if(next == end){
                        return dist[next];
                    }
                }
            }
        }

        return -1;
    }
}