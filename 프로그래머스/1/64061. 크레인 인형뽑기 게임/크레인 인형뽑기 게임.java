import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int move : moves){
            int i = 0;
            while(i < board.length){
                if(board[i][move - 1] != 0){
                    int doll = board[i][move -1];
                    board[i][move -1] = 0;
                    
                    if(!stack.isEmpty() && stack.peek() == doll){
                        stack.pop();
                        answer+=2;
                        break;
                    }else{
                        stack.push(doll);
                    }
                break;
                }   
            i++;
        }
        }
        return answer;
    }
}