import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        List<Integer> lst = new ArrayList<>();
        
        for(int item : arr){
            if(st.isEmpty()){
                st.push(item);
                lst.add(item);
            }else if(st.peek() == item){
                continue;
            }else if(st.peek() != item){
                st.push(item);
                lst.add(item);
            }
        }
        
        int [] answer = new int[lst.size()];
        for(int i = 0; i < lst.size(); i++){
            answer[i] = lst.get(i);
        }
        
        return answer;
    }
}