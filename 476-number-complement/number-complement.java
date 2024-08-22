class Solution {
    public int findComplement(int num) {
        return complement(num);
    }
    public static int complement(int n){
        int len = Integer.toBinaryString(n).length();
        int numof1s = (1<<len) - 1;
        return (n ^ numof1s);
    }
}
