class Solution {
    public double averageWaitingTime(int[][] customers) {
        double totalWaitTime = 0;
        int finishTime = 0;
        
        for (int[] customer : customers) {
            int arrivalTime = customer[0];
            int prepTime = customer[1];
            
            // If the chef is idle, he starts at the customer's arrival time
            if (finishTime < arrivalTime) {
                finishTime = arrivalTime;
            }
            
            // Calculate the finish time for the current order
            finishTime += prepTime;
            
            // Calculate the waiting time for the current customer
            int waitTime = finishTime - arrivalTime;
            totalWaitTime += waitTime;
        }
        
        return totalWaitTime / customers.length;
    }
}
