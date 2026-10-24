class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int [] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int startAlice = dateToDay(arriveAlice, daysInMonths);
        int endAlice = dateToDay(leaveAlice, daysInMonths);
        int startBob = dateToDay(arriveBob, daysInMonths);
        int endBob = dateToDay(leaveBob, daysInMonths);
        int overlapStart = Math.max(startAlice, startBob);
        int overlapEnd = Math.min(endAlice, endBob);

        if(overlapStart > overlapEnd){
            return 0;
        }
        else{
            return overlapEnd - overlapStart +1;
        }
    }
    private int dateToDay(String dateStr, int[] daysInMonths) {
        int month = Integer.parseInt(dateStr.substring(0, 2));
        int day = Integer.parseInt(dateStr.substring(3, 5));

        int dayCount = 0;
        for (int i = 0; i < month - 1; i++) {
            dayCount += daysInMonths[i];
        }
        return dayCount + day;
    }
}