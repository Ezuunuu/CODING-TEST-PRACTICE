class Solution {
    enum DayOfWeek {
        THU,
        FRI,
        SAT,
        SUN,
        MON,
        TUE,
        WED;
    }
    
    public String solution(int a, int b) {
        String answer = "";
        int index = 0;
        
        int month = 0;
        for (int i = 1; i < a; i++) {
            switch(i) {
                case 4:
                case 6:
                case 9:
                case 11:
                    month += 30;
                    break;
                case 2:
                    month += 29;
                    break;
                default:
                    month += 31;
                    break;
            }
        }
        
        index = (month + b) % 7;
        answer = DayOfWeek.values()[index].toString();
        
        return answer;
    }
}