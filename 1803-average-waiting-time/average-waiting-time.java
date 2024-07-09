class Solution {
    public double averageWaitingTime(int[][] customers) {
        double avg=0;
        int fintime=customers[0][0];
        for(int i = 0;i<customers.length;i++){
                if(customers[i][0]<=fintime){
                    fintime+=customers[i][1];
                    avg += (fintime-customers[i][0]);
                }
                else {
                    fintime = customers[i][0]+customers[i][1];
                    avg += (fintime-customers[i][0]); 
                }
        }
        return avg/customers.length;
    }
}