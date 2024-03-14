class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 1; // Initializing prefixSum[0] to handle subarrays starting from index 0.
        for (int num : nums) {
            sum += num;
            if (sum >= goal) {
                // If current sum is greater than or equal to the goal,
                // then the number of subarrays ending at the current index
                // with sum equal to the goal is prefixSum[sum - goal].
                count += prefixSum[sum - goal];
            }
            prefixSum[sum]++; // Increment the prefix sum count.
        }
        return count;
    }
}
