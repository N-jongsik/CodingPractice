import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int [] answer = new int[commands.length];
                
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2];
            
            List<Integer> lst = new ArrayList<>();
            
            for(int j = start; j <= end; j++){
                lst.add(array[j-1]);
            }
            Collections.sort(lst);
            answer[i] = lst.get(index-1);
        }
        
        return answer;
    }
}