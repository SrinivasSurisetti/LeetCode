// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         if (s1.length() > s2.length()) {
//             return false;
//         }
//         int[] s1Count = new int[26];
//         int[] s2Count = new int[26];
//         for (int i = 0; i < s1.length(); i++) {
//             s1Count[s1.charAt(i) - 'a']++;
//             s2Count[s2.charAt(i) - 'a']++;
//         }
//         for (int i = 0; i <= s2.length() - s1.length(); i++) {
//             if (matches(s1Count, s2Count)) {
//                 return true;
//             }
//             if (i < s2.length() - s1.length()) {
//                 s2Count[s2.charAt(i) - 'a']--;
//                 s2Count[s2.charAt(i + s1.length()) - 'a']++;
//             }
//         }
//         return false;
//     }

//     private boolean matches(int[] s1Count, int[] s2Count) {
//         for (int i = 0; i < 26; i++) {
//             if (s1Count[i] != s2Count[i]) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Solution{
    public boolean checkInclusion(String s1,String s2){
        int[] s1freq = new int[26];
        int[] windfreq = new int[26];
        for(int i = 0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
        }
        int windowsize = s1.length(); 
        for(int i = 0;i<s2.length();i++){
            windfreq[s2.charAt(i) - 'a']++;
            if(i >= windowsize){
                windfreq[s2.charAt(i-windowsize) - 'a']--;
            }
            if(matches(s1freq,windfreq)){
                return true;
            }
        }
        return false;
    }
    public boolean matches(int[] s1freq,int[] windfreq){
        for(int i = 0;i<26;i++){
            if(s1freq[i]!=windfreq[i]){
                return false;
            }
        }
        return true;
    }
}