import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List <Integer> list = new ArrayList<>();
        int value = -1;
        
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != value){
                list.add(arr[i]);
                value = arr[i];
            }
        }
        
        int [] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}