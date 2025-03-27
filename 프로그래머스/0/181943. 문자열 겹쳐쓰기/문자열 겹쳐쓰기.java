import java.util.*;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0,s);
        answer += overwrite_string;
        
        int len = overwrite_string.length();
        
        answer += my_string.substring(s+len,my_string.length());
        return answer;
    }
}