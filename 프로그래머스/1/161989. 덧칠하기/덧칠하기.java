class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] data = new int[n];
        for (int i = 0; i < n; i ++) {
            data[i] = 0;
        }
        
        for (int i = 0; i < section.length; i++) {
            data[section[i] - 1] = 1;
        }
        
        for (int i = 0; i < n; i++) {
            int index = i;
            if (data[index] == 0) continue;
            while(index < i + m && index < data.length) {
                data[index] = 0;
                index++;
            }
            if (index != i) {
                answer++;
            }
            
        }
        
        
        return answer;
    }
}