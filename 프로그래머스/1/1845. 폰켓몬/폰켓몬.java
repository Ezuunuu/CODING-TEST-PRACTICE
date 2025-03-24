class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;
        int[] arr = new int[length];
        
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < length; j++) {
                if (nums[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                arr[answer++] = nums[i];
            }
        }
        if (answer > length / 2) {
            answer = length / 2;
        }
        return answer;
    }
}