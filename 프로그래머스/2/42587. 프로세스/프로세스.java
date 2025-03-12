import java.util.*;

class Solution {
    public class Prior{
        int i;
        int priority;
        
        public Prior(int i, int priority){
            this.i = i;
            this.priority = priority;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Prior> q = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            q.offer(new Prior(i,priorities[i]));
        }
        
        while(!q.isEmpty()){
            Prior p = q.poll();
            
            for(Prior item : q){
                if(item.priority > p.priority){
                    q.offer(p);
                    p = null;
                    break;
                }
            }
            
            if(p != null){
                answer ++;
                if(p.i == location){
                    return answer;
                }
            }
            
        }
        
        return answer;
    }
}