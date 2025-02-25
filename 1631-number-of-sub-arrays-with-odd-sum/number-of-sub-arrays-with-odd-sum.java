class Solution {
    public int numOfSubarrays(int[] arr) {
        // ArrayList<Integer> res = new ArrayList<>();
        // int count = 0;
        // for(int start = 0; start<arr.length;start++){
        //     for(int end=start+1; end<=arr.length;end++){
        //         int[] subArray = Arrays.copyOfRange(arr,start,end);
        //         int sm = Arrays.stream(subArray).sum();
        //         if(sm%2==1) count++;
        //     }
        // }
        // return count;

        int prefixSum = 0;
        int evenCount = 1;
        int oddCount = 0;
        int count= 0;
        int mod = 1000000007;
        for(int ele : arr){
            prefixSum+=ele;
            if(prefixSum%2==0){
                count = (count+oddCount)%mod;
                evenCount++;
            }
            else {
                count = (count + evenCount) % mod;
                oddCount++;
            }
        }
    return count;
    }
}