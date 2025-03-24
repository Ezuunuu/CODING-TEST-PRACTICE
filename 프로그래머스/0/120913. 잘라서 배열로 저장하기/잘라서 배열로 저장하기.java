class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() / n + (my_str.length() % n != 0 ? 1 : 0);
        String[] answer = new String[length];
        
        for (int i = 0; i < my_str.length() / n; i++) {
            answer[i] = my_str.substring(i * n, (i + 1) * n);
        }
        
        if (my_str.length() % n != 0) {
            answer[my_str.length() / n] = my_str.substring((my_str.length() / n) * n);
        }
        
        return answer;
    }
}