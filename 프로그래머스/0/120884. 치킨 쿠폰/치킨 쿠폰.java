class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int free = chicken;
        while (free / 10 > 0) {
            int rest = free % 10;
            free /= 10;
            answer += free;
            free += rest;
        }
        return answer;
    }
}