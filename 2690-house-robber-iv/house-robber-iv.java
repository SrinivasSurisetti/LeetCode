class Solution {
    public int minCapability(int[] nums, int k) {
        int left = Arrays.stream(nums).min().getAsInt();
        int ryt = Arrays.stream(nums).max().getAsInt();
        while(left<ryt){
            int mid = (left+ryt)/2;
            if(canRob(mid,nums,k)) ryt = mid;
            else left = mid + 1; 
        }
        return left;
    }
        private boolean canRob(int capability,int[] nums,int k){
            int count = 0;
            int i  = 0;
            while( i < nums.length){
                if(nums[i]<= capability){
                    count++;
                    i++;
                }
                i++;
            }
            return count>=k;
        }
    }