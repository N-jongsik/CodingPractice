class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max=0;
        for(int i=0;i<sides.length;i++){
            if(max<=sides[i]){
                max=sides[i];
            }
        }
        for(int i:sides){
            answer+=i;
        }
        int other=answer-max;
        if(other>max){
            return 1;
        }else{
            return 2;
        }
    }
}