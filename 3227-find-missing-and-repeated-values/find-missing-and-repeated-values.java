import java.util.Arrays;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length; // Extracting n from grid size
        int[] ar = new int[n * n + 1]; // Tracking occurrences of numbers 1 to n*n
        int[] res = new int[2]; // [Repeated, Missing]
        
        // Count occurrences
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[grid[i][j]]++;
            }
        }

        // Find missing and repeated values
        for (int i = 1; i <= n * n; i++) {
            if (ar[i] == 0) res[1] = i; // Missing number
            if (ar[i] == 2) res[0] = i; // Repeated number
        }

        return res;
    }
}
