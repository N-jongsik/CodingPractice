import java.io.*;
import java.util.*;

public class Main{
    static class Node implements Comparable<Node>{
        int idx;
        int cost;

        Node(int idx, int cost){
            this.idx = idx;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node O){
            return this.cost - O.cost; //오름차순
        }
    }

    static List<List<Node>> graph;
    static int [] dist;
    static int INF = (int)1e9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        dist = new int [N+1];

        for(int i = 0; i <= N; i++){
            graph.add(new ArrayList<>());
            dist[i] = INF;
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b,c));
            graph.get(b).add(new Node(a,c));
        }

        dijkstra(1);

        System.out.println(dist[N]);
    }
    static void dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));
        dist[start] = 0;

        while(!pq.isEmpty()){
            Node now = pq.poll();

            if(dist[now.idx] < now.cost) continue;

            for(Node next : graph.get(now.idx)){
                if(dist[next.idx] > dist[now.idx] + next.cost){
                    dist[next.idx] = dist[now.idx] + next.cost;
                    pq.offer(new Node(next.idx, dist[next.idx]));
                }
            }
        }
    }
}
