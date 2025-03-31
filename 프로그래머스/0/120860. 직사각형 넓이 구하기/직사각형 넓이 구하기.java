class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int line1 = 0;
        int line2 = 0;
        for (int i = 1; i < dots.length; i++) {
            if (dots[0][0] == dots[i][0]) {
                line1 = dots[i][1] - dots[0][1];
                if (line1 < 0) line1 *= -1;
            } else if (dots[0][1] == dots[i][1]) {
                line2 = dots[i][0] - dots[0][0];
                if (line2 < 0) line2 *= -1;
            }
        }
        answer = line1 * line2;
        return answer;
    }
}