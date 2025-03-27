class Solution {
    public String solution(String s) {
        String answer = "";
        String[] data = s.split(" ");
        
        int min = Integer.parseInt(data[0]);
        int max = Integer.parseInt(data[0]);
        
        for (int i = 0; i < data.length; i++) {
            int value = Integer.parseInt(data[i]);
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
            
            answer = min + " " + max;
            
        }
        
        return answer;
    }
}