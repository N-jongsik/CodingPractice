class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]); // 큰 쪽을 가로
            int h = Math.min(size[0], size[1]); // 작은 쪽을 세로

            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }

        return maxWidth * maxHeight;
    }
}
