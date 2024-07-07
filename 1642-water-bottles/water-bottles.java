class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while(numBottles>=numExchange){
            int refill = numBottles/numExchange;
            total += refill;
            int empty = numBottles%numExchange;
            numBottles = refill+empty; 
        }
        return total;
    }
}