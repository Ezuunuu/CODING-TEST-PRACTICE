class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        for (int i = 0; i < 4; i++) {
            int[][] line1 = new int[2][2];
            int[][] line2 = new int[2][2];
            for (int j = 0; j < 4; j++) {
                if (i == j) break;
                line1[0] = dots[i];
                line1[1] = dots[j];
                
                for (int k = 0; k < 4; k++) {
                    if (k != i && k != j) {
                        line2[0] = dots[k];
                    }
                }
                
                for (int k = 3; k > 0; k--) {
                    if (k != i && k != j) {
                        line2[1] = dots[k];
                    }
                }
                double incline1 = getIncline(line1[0], line1[1]);
                double incline2 = getIncline(line2[0], line2[1]);
                
                if (incline1 == incline2 && incline1 != -1 && incline2 != -1) return 1;
            }
        }
        return answer;
    }
    
    double getIncline(int[] n1, int[] n2) {
        double x = n1[1] - n2[1];
        double y = n1[0] - n2[0];
        
        if (x == 0) return -1;
        
        return y / x;
    }

}