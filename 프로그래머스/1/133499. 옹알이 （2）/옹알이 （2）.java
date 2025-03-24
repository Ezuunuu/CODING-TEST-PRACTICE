class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] letters = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String before = "";
            int index = 2;
            while(!babbling[i].equals("") && index <= 3 && babbling[i].length() >= index) {
                String temp = babbling[i].substring(0, index);
                if (contains(letters, temp) && !before.equals(temp)) {
                    babbling[i] = babbling[i].substring(index);
                    index = 2;
                    before = temp;
                } else {
                    index++;
                }
            }
            if (babbling[i].equals("")) {
                answer++;
            }
        }
        return answer;
    }
    
    boolean contains(String[] data, String s) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(s)) {
                return true;
            }
        }
        return false;
    }
}