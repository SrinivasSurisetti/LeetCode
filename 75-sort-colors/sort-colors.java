class Solution {
    public void sortColors(int[] nums) {
        int[] ans=new int[301];
        for(int i=0;i<nums.length;i++){
            ans[nums[i]]++;
        }
        int k = 0;
        for(int j = 0;j<3;j++){
            while(ans[j]>0){
                nums[k] = j;
                k++;
                ans[j]--;
            }
        }
    }
}