class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> charct = new HashMap<>();
        for(char c : s.toCharArray()){
            if(charct.containsKey(c)){
                charct.put(c,charct.get(c)+1);
            }
            else{
                charct.put(c,1);
            }
        } 
        int count = 0;
        int flag = 0;
        for(Map.Entry<Character,Integer> entry : charct.entrySet()){
            int val = entry.getValue();
            if(val%2 == 1){
                flag = 1;
            }
            count += (val/2)*2;
        }
        return count+flag;
    }
}