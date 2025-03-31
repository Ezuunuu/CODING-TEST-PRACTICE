class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer++;
            while (check3(answer)) {
                answer++;
            }
            n--;
            System.out.println(answer);
        }
        return answer;
    }
    
    boolean check3(int n) {
        if (n % 3 == 0 || (n + "").contains("3")) {
            return true;
        }
        return false;
    }
}