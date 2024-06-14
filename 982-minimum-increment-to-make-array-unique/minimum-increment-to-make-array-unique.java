class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max=nums[0];
        for(int num : nums){
            max = Math.max(num,max);
        }
        int[] freq = new int[max+nums.length];
        for(int num : nums){
            freq[num]++;
        }
        int ans = 0;
        for(int n=0;n<freq.length;n++){
            if(freq[n]<=1) continue;

            int dup = freq[n] - 1;
            freq[n+1] += dup;
            ans += dup;
        }
        return ans;
    }
}