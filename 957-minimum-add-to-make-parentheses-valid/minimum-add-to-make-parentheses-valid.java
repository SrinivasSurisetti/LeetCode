class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int unmatch = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else unmatch++;
            }
        }
        return open+unmatch;
    }
}