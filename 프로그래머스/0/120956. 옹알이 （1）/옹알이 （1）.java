class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int length = babbling.length;
        
        for (int i = 0; i < length; i++) {
            if (isPossible(babbling[i])) {
                answer++;
            }
        }
        
        return answer;
    }
    
    boolean isPossible(String value) {
        String[] word = {"aya", "ye", "woo", "ma"};
        int count = 0;
        while(value != "") {
            if (value.contains(word[count])) {
                value = value.replace(word[count], " ");
            } else {
                value += " ";
            }
            count++;
            if (count == 4) {
                if (value.equals("    ")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}