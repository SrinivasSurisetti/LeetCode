class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int leftInd = -1;
        int rytInd = -1;
        int badInd = -1;
        long ans = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK) badInd = i;
            if(nums[i]==minK) leftInd = i;
            if(nums[i]==maxK) rytInd = i;
            ans += Math.max(0,Math.min(leftInd,rytInd)-badInd);
        }
        return ans;
    }
}