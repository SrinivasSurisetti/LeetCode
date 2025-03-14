class Solution {
    public int maximumCandies(int[] candies, long k) {
        long total = Arrays.stream(candies).asLongStream().sum();
        if(total<k) return 0;
        int left = 1;
        int ryt = Arrays.stream(candies).max().getAsInt();
        while(left < ryt){
            int mid = (left+ryt+1)/2;
            long count = 0;
            for(int candy : candies) count += (candy/mid);
            if(count>= k) left = mid;
            else ryt = mid-1;
        }
        return left;
    }
}