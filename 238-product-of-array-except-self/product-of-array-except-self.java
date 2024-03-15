class Solution {
    public int[] productExceptSelf(int[] nums) {
        //3Ms answer
        // int n = nums.length;
        // int[] leftProd = new int[n];
        // int[] rytProd = new int[n];
        // leftProd[0] = 1;
        // for(int i = 1;i<n;i++){
        //     leftProd[i] = leftProd[i-1] * nums[i-1];
        // }
        // rytProd[n-1] = 1;
        // for(int i=n-2;i>=0;i--){
        //     rytProd[i] = rytProd[i+1] * nums[i+1];
        // }
        // int[] res = new int[n];
        // for(int i =0;i<n;i++){
        //     res[i] = leftProd[i] * rytProd[i];
        // }
        // return res;
        //1ms Answer method
        int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        for(int i = 0;i<n;i++) {
            ans[i] = prod;
            prod = prod * nums[i];
        }
        prod = 1;
        for(int i=n-1;i>=0;i--){
            ans[i] = ans[i] * prod;
            prod = prod * nums[i];
        }
        return ans;
    }
}