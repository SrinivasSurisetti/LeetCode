class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        int maxdist = 0;
        for(int i = 1;i<arrays.size();i++){
            List<Integer> ar = arrays.get(i);
            int curmin = ar.get(0);
            int curmax = ar.get(ar.size()-1);
            //maxdist
            maxdist = Math.max(maxdist,Math.abs(curmax-min));
            maxdist = Math.max(maxdist,Math.abs(max-curmin));

            min = Math.min(curmin,min);
            max = Math.max(curmax,max);
        }
        return maxdist;
    }
}