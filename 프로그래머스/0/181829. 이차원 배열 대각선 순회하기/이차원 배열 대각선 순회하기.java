class Solution {
    int sum = 0;
    public int solution(int[][] board, int k) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((i+j) <= k){
                    sum+=board[i][j];
                }
            }
        }
        
        return sum;
    }
}