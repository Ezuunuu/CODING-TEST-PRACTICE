
import java.util.Arrays;

public class SpiralPlacing {
    public static void main(String[] args) {
        int[][] example1 = solution(4);
        for (int i = 0; i < example1.length; i++) {
            System.out.println(Arrays.toString(example1[i]));
        }

        System.out.println();

        int[][] example2 = solution(5);
        for (int i = 0; i < example2.length; i++) {
            System.out.println(Arrays.toString(example2[i]));
        }
    }

    static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int index = 1;

        int horizonStart = 0;
        int horizonEnd = n - 1;
        int verticalStart = 0;
        int verticalEnd = n - 1;

        while(index <= n * n) {
            // 왼쪽에서 오른쪽
            for (int i = horizonStart; i <= horizonEnd; i++) {
                answer[verticalStart][i] = index++;
            }
            verticalStart++;
            // 오른쪽 위에서 오른쪽 아래로
            for (int i = verticalStart; i <= verticalEnd; i++) {
                answer[i][horizonEnd] = index++;
            }
            horizonEnd--;
            // 오른쪽에서 왼쪽으로
            for (int i = horizonEnd; i >= horizonStart; i--) {
                answer[verticalEnd][i] = index++;
            }
            verticalEnd--;
            // 왼쪽 아래에서 왼쪽 위로
            for (int i = verticalEnd; i >= verticalStart; i--) {
                answer[i][horizonStart] = index++;
            }
            horizonStart++;
        }

        return answer;
    }
}
