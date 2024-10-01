class Solution {
    public boolean canArrange(int[] arr, int k) {
        // To store the count of remainders when elements are divided by k
        int[] remainderCount = new int[k];
        
        // Count the frequency of each remainder
        for (int num : arr) {
            // Handle negative numbers by adding k and taking modulo again
            int remainder = ((num % k) + k) % k;
            remainderCount[remainder]++;
        }
        
        // Now check if pairs can be formed
        for (int i = 1; i < k; i++) {
            // Check if remainder i can pair with remainder k - i
            if (remainderCount[i] != remainderCount[k - i]) {
                return false;
            }
        }
        
        // Check if there's an even number of elements with remainder 0 (as they pair with themselves)
        return remainderCount[0] % 2 == 0;
    }
}
