class Solution {
    public int passThePillow(int n, int time) {
        if(n>time){
            return 1+time;
        }
        else{
        int div = (int)(time/(n-1));
        int mod = (int)(time%(n-1));
        if(div%2==1){
            return n-mod;
            }
        else{
            return 1+mod;
            }
        }
    }
}