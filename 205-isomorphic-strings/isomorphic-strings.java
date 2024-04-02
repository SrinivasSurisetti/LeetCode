class Solution {
    public boolean isIsomorphic(String s, String t) {
        int flag = 0;
        HashMap<Character,Character> list1 = new HashMap<>();
        HashMap<Character,Character> list2 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(list1.containsKey(sChar)){
                if(list1.get(sChar) != tChar){
                    return false;
                }
            }
            else {
                list1.put(sChar,t.charAt(i));
            }
            if(list2.containsKey(tChar)){
                if(list2.get(tChar) != sChar){
                    return false;
                }
            }
            else {
                list2.put(tChar,sChar);
            }
        }
        return true;
    }
}