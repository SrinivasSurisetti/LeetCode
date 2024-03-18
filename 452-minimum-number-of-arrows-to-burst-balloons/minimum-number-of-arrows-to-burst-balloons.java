class Solution {
    public int findMinArrowShots(int[][] points) {
        int arrows = 1;
        Arrays.sort(points,Comparator.comparingInt(ar -> ar[0])); //sorts the 1st column of array
        int end = points[0][1];
        for(int i=1;i<points.length;i++){
            int currentStart = points[i][0];
            int currentEnd = points[i][1];
            if(end < currentStart){
                arrows++;
                end = currentEnd;
            }
            else end = Math.min(end,currentEnd);
        }
        return arrows;
    }
}