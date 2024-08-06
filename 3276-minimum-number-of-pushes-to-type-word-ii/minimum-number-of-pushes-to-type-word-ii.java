class Solution {
    public int minimumPushes(String word) {
        int[] charr = new int[26];
        // Arrays.fill(charr,0);
        for(char ch : word.toCharArray()){
            charr[ch-'a']++;
        }
        // Arrays.sort(charr,Collections.reverseOrder()); //if Integer[] is used
        Arrays.sort(charr);
        int ans = 0;
        int digit = 0;
        for(int i = charr.length -1;i>=0;i--){
            ans += (digit/8 + 1)*charr[i];
            digit++;
        }
        return ans;
    }
}