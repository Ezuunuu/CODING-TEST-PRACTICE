class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int point = total / num + (1 - num) / 2;
        
        for (int i = 0; i < num; i++) {
            answer[i] = point++;
        }
        
        
        return answer;
    }
}