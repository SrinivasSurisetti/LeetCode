class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        int target = tickets[k];
        for(int i = 0;i<tickets.length;i++){
            if(i<=k) count += Math.min(tickets[i],target);
            else count += Math.min(tickets[i],target-1);
        }
        return count;
    }
}