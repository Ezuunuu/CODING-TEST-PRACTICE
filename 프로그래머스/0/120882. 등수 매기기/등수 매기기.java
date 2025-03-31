class Solution {
    public int[] solution(int[][] score) {
        int length = score.length;
        int[] answer = new int[length];
        double[] avg = new double[length];
        
        for (int i = 0; i < length; i++) {
            avg[i] = (double) (score[i][0] + score[i][1]) / 2;
        }
        
        for (int i = 0; i < length; i++) {
            int rank = 1;
            for (int j = 0; j < length; j++) {
                if (avg[i] < avg[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }    
        
        return answer;
    }
}