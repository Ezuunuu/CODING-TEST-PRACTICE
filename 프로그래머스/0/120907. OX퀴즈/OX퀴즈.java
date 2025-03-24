class Solution {
    public String[] solution(String[] quiz) {
        int length = quiz.length;
        String[] answer = new String[length];
        for (int i = 0; i < length; i++) {
            String[] str = quiz[i].split(" ");
            int res = Integer.parseInt(str[4]);
            int tmp = 0;
            if (str[1].equals("+")) {
                tmp = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
            } else {
                tmp = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
            }
            
            if (res == tmp) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
            
        }
        return answer;
    }
}