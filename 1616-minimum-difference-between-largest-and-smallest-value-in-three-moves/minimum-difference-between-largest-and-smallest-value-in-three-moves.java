class Solution {
    public int minDifference(int[] nums) {
        // int min = Arrays.stream(nums).min().getAsInt();
        // for(int i = 0;i<3;i++){
        //     int max = Arrays.stream(nums).max().getAsInt();
        //     for (int j = 0; j < nums.length; j++) {
        //     if (nums[j] == max) {
        //         nums[j] = min;
        //         break;
        //     }
        // }
        // }
        // int res = Arrays.stream(nums).max().getAsInt() - min;
        // return res;
        if(nums.length<=4) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        //4 condiotions
        res = Math.min(res,nums[n-1]-nums[3]);
        res = Math.min(res,nums[n-2]-nums[2]);
        res = Math.min(res,nums[n-3]-nums[1]);
        res = Math.min(res,nums[n-4]-nums[0]);
        return res;        
    }
}