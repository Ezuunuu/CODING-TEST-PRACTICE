
import java.util.Arrays;

public class SpecificSort {
    public static void main(String[] args) {
        int[] numlist1 = {1, 2, 3, 4, 5, 6};
        int n1 = 4;
        int[] result1 = {4, 5, 3, 6, 2, 1};
        System.out.println(Arrays.toString(solution(n1, numlist1)));

        int[] numlist2 = {10000, 20, 36, 47, 40, 6,10, 7000};
        int n2 = 30;
        int[]result2 = {36, 40, 20, 47, 10, 6, 7000, 10000};
        System.out.println(Arrays.toString(solution(n2, numlist2)));
    }

    static int[] solution(int n, int[] numlist) {
        int length = numlist.length;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) continue;
                int a = Math.abs(numlist[i] - n);
                int b = Math.abs(numlist[j] - n);
                if (a < b) {
                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                } else if (a == b) {
                    if (numlist[i] > numlist[j]) {
                        int tmp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = tmp;
                    }
                }
            }
        }

        answer = numlist;

        return answer;
    }
}
