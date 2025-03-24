class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int measure = 1;
            for (int j = 1; j <= i / 2 && i != 1; j++) {
                if (i % j == 0) {
                    measure++;
                }
                if (measure > limit) {
                    measure = power;
                    break;
                }
            }
            answer += measure;
        }
        
        return answer;
    }
}