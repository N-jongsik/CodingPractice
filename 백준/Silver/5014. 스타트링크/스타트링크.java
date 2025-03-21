import java.io.*;
import java.util.*;

public class Main {
    static int F, S, G, U, D;
    static int[] visited; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken()); // 건물 총 층 수
        S = Integer.parseInt(st.nextToken()); // 현재 위치
        G = Integer.parseInt(st.nextToken()); // 목표 층
        U = Integer.parseInt(st.nextToken()); // 위로 U층 이동
        D = Integer.parseInt(st.nextToken()); // 아래로 D층 이동

        visited = new int[F + 1]; // 방문 여부 및 이동 횟수 저장

        int result = bfs();

        if (result == -1) {
            System.out.println("use the stairs");
        } else {
            System.out.println(result);
        }
    }

    public static int bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(S);
        visited[S] = 1; // 시작 위치 방문 (이동 횟수 1로 설정)

        while (!q.isEmpty()) {
            int cur = q.poll(); 

            if (cur == G) return visited[cur] - 1; // 목표 층 도달 시 이동 횟수 반환

            int[] nextFloors = {cur + U, cur - D}; // 위로 U층, 아래로 D층 이동 가능

            for (int next : nextFloors) {
                if (next >= 1 && next <= F && visited[next] == 0) { // 1층 이상, F층 이하만 이동 가능
                    visited[next] = visited[cur] + 1; // 이동 횟수 기록
                    q.offer(next);
                }
            }
        }
        return -1; // 목표 층 도달 불가
    }
}
