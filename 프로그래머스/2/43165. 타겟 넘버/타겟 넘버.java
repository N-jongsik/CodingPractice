class Solution {
    static int len;
    static int sum;
    static int answer;
    
    public int solution(int[] numbers, int target) {
        len = numbers.length;
        sum = 0;
        answer = 0;
        dfs(0, target, sum,numbers);
        return answer;
    }
    public static void dfs(int level, int target, int sum, int [] numbers){
        if(level == len){
            if(sum == target){
                answer ++;
            }
            return;
        }
        dfs(level + 1, target, sum+numbers[level], numbers);
        dfs(level + 1, target, sum-numbers[level], numbers);
    }
}