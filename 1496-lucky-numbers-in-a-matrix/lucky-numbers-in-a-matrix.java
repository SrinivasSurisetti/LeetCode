class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i<m;i++){
            int min = Integer.MAX_VALUE;
            int minind = -1;
            for(int j = 0;j<n;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    minind = j;
                }
            }
            boolean islucky = true;
            for(int k = 0;k<m;k++){
                if(matrix[k][minind] > min){
                    islucky = false;
                    break;
                }
            }
            if(islucky) res.add(min);
        }
        return res;
    }
}