class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int flag=0;
        int count = 0;
        int len = arr.length;
        for(int num : arr){
            if(num%2==1) {
                count++;
                if(count==3) return true;
            }
            else count = 0;
        }
        return false;
    }
}