
import java.util.Arrays;

public class MakeRank {
    public static void main(String[] args) {
        int[][] example1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[] result1 = {1, 2, 4, 3};
        int[][] example2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[] result2 = {4, 4, 6, 2, 2, 1, 7};

        System.out.println(Arrays.toString(solution(example1)));
        System.out.println(Arrays.toString(solution(example2)));
    }

    static int[] solution(int[][] score) {
        int length = score.length;
        int[] answer = new int[length];
        int[] sum = new int[length]; // 평균이나 합이나 사실상 같음

        for (int i = 0; i < length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }

        for (int i = 0; i < length; i++) {
            int rank = 1;
            for (int j = 0; j < length; j++) {
                if (i == j) continue; // 같으면 비교 안함
                if (sum[i] < sum[j]) { // sum[i] 보다 큰 것을 찾으면 rank++
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}
