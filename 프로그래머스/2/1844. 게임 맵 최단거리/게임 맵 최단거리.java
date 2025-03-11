import java.util.*;

class Solution {
    static int [] dx = {-1,1,0,0};
    static int [] dy = {0,0,-1,1};
    
    static int n;
    static int m;
    
    static int [][] result;
    
    public int solution(int[][] maps) {        
        n = maps.length;
        m = maps[0].length;
    
        result = new int [n][m];
        
        bfs(0,0,maps);
        
        int answer = -1;
        
        if(result[n-1][m-1] !=0) answer = result[n-1][m-1] + 1;
        
        return answer;
    }
    
    public static void bfs(int x, int y, int [][] maps){
        Queue<int []> q = new LinkedList<>();
        q.offer(new int [] {x,y});
        
        while(!q.isEmpty()){
            int [] cur = q.poll();
            
            int curX = cur[0];
            int curY = cur[1];
            
            for(int i = 0; i < 4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                
                if(nx>=0 && nx<n && ny >=0 && ny<m && maps[nx][ny] == 1){
                    q.offer(new int[] {nx,ny});
                    maps[nx][ny] = 0;
                    result[nx][ny] = result[curX][curY] + 1;
                }
            }
        }
    }
}