class Solution {
    public boolean lemonadeChange(int[] bills) {
        int numOf5= 0;
        int numOf10 = 0;
        int numOf20 = 0;
        for(int ele : bills){
            if(ele==5){
                numOf5++;
            }
            else if(ele==10 && numOf5>=1){
                numOf10++;
                numOf5--;
            }
            else if(ele==20 && ((numOf5>=1 &&numOf10>=1) || (numOf5>=3))){
                if(numOf5>=1 &&numOf10>=1){
                    numOf10--;
                    numOf5--;
                }
                else{
                    numOf5 -= 3;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}