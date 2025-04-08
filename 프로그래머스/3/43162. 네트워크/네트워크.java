import java.util.*;

class Solution {
    static boolean [] visited;
    static int answer;
    
    public int solution(int n, int[][] computers) {
        answer = 0;
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                bfs(i, n, computers);
                answer++;
            }
        }
               
        return answer;
    }
    
    public static void bfs(int i, int n, int [][] computers){
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visited[i] = true;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            for(int j = 0; j < n; j++){
                if(computers[cur][j] == 1 && !visited[j]){
                    q.offer(j);
                    visited[j] = true;
                }
            }
        }
        
    }
}