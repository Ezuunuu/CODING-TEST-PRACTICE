import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = l; i <= r; i++) {
            if(i % 5 != 0) {
                continue;
            }
            String value = "" + i;
            for(int j = 0; j < value.length(); j++) {
                if(value.charAt(j) - '0' != 5 && value.charAt(j) - '0' != 0) {
                    break;
                }
                if(j == value.length() - 1) {
                    result.add(i);
                }
            }
        }
        if(result.size() == 0) {
            result.add(-1);
        }
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}