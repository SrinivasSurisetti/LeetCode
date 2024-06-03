class Solution {
    public int appendCharacters(String s, String t) {
        int indS = 0;
        int indT = 0;
        while(indS < s.length()){
            if(s.charAt(indS) == t.charAt(indT)){
                indT++;
                if(indT==t.length()){
                    return 0;
                }
            }
            indS++;
        }
        return t.length()  - indT;
    }
}