import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] reach = new int[N];
        int[] fail = new int[N];
        
        float[] rate = new float[N];
        
        for (int i = 0; i < N; i++) {
            answer[i] = 0;
            reach[i] = 0;
            fail[i] = 0;
            rate[i] = 0;
        }
        
        Arrays.sort(stages);
        
        for (int i = 0; i < stages.length; i++) {
            for (int j = 1; j <= N; j++) {
                if (stages[i] >= j) {
                    reach[j - 1]++;
                    if (stages[i] == j) {
                        fail[j - 1]++;
                    }
                }
                
            }
        }
        
        for (int i = 0; i < N; i++) {
            if (fail[i] == 0 || reach[i] == 0) {
                rate[i] = 0;
                continue;
            }
            rate[i] = (float) fail[i] / reach[i];
        }
        
        float[] tmp = rate.clone();
        
        Arrays.sort(rate);
        rate = reverse(rate);
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (rate[i] == tmp[j]) {
                    answer[i] = j + 1;
                    tmp[j] = -1;
                    break;
                }
            }
        }
        
        
        return answer;
    }
    
   static float[] reverse(float[] array) {
       float[] newArray = new float[array.length];

       for (int i = 0; i < array.length; i++) {
           newArray[array.length - 1 - i] = array[i];
       }

       return newArray;
   }
}