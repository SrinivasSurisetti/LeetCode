class Solution {
    public int minSwaps(int[] nums) {
        int[] arr = new int[nums.length+nums.length];
        for(int i = 0;i<arr.length;i++){
            arr[i] = nums[i%nums.length];
        }
        int windowsize = (int)Arrays.stream(nums).filter(num -> num == 1).count();
        int max = 0;
        int cur = 0;
        for(int  i = 0;i<arr.length;i++){
            if(arr[i]==1){
                cur++;
            }
            if(i>=windowsize && arr[i-windowsize]==1){
                cur--;
            }
            max = Math.max(max,cur);
        }
        return windowsize - max;
    }
}