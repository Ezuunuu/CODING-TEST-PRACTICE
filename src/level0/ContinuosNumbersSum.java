import java.util.Arrays;


public class ContinuosNumbersSum {
    public static void main(String[] args) {
        int exNum1 = 3;
        int exTotal1 = 12;
        int[] result1 = {3, 4, 5};
        System.out.println(Arrays.toString(solution(exNum1, exTotal1)));

        int exNum2 = 5;
        int exTotal2 = 15;
        int[] result2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(exNum2, exTotal2)));

        int exNum3 = 4;
        int exTotal3 = 14;
        int[] result3 = {2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(exNum3, exTotal3)));

        int exNum4 = 5;
        int exTotal4 = 5;
        int[] result4 = {-1, 0, 1, 2, 3};
        System.out.println(Arrays.toString(solution(exNum4, exTotal4)));
    }

    static int[] solution(int num, int total) {
        int[] answer = new int[num];

        int point = total / num + (1 - num) / 2; // 시작점 찾기

        for (int i = 0; i < num; i++) {
            answer[i] = point++;
        }

        return answer;
    }
}
