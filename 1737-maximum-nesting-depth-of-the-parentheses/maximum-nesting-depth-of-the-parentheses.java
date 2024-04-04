class Solution {
    public int maxDepth(String s) {
        int ct = 0;
        int maxCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') {
                ct++;
                maxCount = Math.max(ct,maxCount);
            }
            else if(s.charAt(i) == ')') ct--;
        }
        return maxCount;
    }
}