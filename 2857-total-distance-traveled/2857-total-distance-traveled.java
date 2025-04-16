class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while(mainTank > 0){
            distance++;
            mainTank--;
            if(distance != 0 && distance % 5 == 0 && additionalTank-- > 0){
                mainTank++;
            }  
        }
        return distance * 10;
    }
}