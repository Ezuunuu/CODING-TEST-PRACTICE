public class HateEnglish {
    public static void main(String[] args) {
        String numbers1 = "onetwothreefourfivesixseveneightnine";
        long result1 = 123456789;
        System.out.println(solution(numbers1));
        
        String numbers2 = "onefourzerosixseven";
        long result2 = 14067;
        System.out.println(solution(numbers2));
    }

    static long solution(String numbers) {
        long answer = 0;
        String[] preset = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            numbers = numbers.replaceAll(preset[i], i + "");
        }

        answer = Long.parseLong(numbers);

        return answer; 
    }
}
