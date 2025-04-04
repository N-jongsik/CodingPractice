import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<>();
        
        Map<String,Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length; i++){
            map.put(name[i],yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j < photo[i].length; j++){
                if(map.containsKey(photo[i][j])){
                    sum += map.get(photo[i][j]);
                }
            }
            answer.add(sum);
        }
        int [] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}