import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        
        if(set.size() > len){
            return len;
        }else{
            return set.size();
        }
    }
}