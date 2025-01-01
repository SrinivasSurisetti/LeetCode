class Solution {
    public int maxScore(String s) {
        int numOfOnes = 0;
        int leftZeros = 0;
        int maxScore = 0;
        for(char c : s.toCharArray()){
            if(c =='1'){
                numOfOnes++;
            } 
        }
        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                leftZeros++;
            }
            else{
                numOfOnes--;
            }
            maxScore = Math.max(maxScore,leftZeros+numOfOnes);
        }
        return maxScore;
    }
}