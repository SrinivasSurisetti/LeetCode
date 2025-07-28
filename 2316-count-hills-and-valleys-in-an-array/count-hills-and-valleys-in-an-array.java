class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        if(n<3) return 0;

        int prevNum = nums[0];
        for(int i = 1;i<n-1;i++){
            if(nums[i] == prevNum) continue;
            int nextNum = -1;
            for(int j = i+1;j<n;j++){
                if(nums[j] != nums[i]) {
                    nextNum = nums[j];
                    break;
                } 
            }
            if(nextNum == -1) break;
            if(nums[i] > prevNum && nums[i] > nextNum) count++;
            else if(nums[i] < prevNum && nums[i] < nextNum) count++;
            prevNum = nums[i];
        }
        return count;
    }
}