class Solution {
    public int getLucky(String s, int k) {
        int sum =0;
        for(char ch : s.toCharArray()){
            int val = ch - 'a' + 1;
            while(val>0){
                sum+= val%10;
                val /= 10;
            }
        }
        for(int i = 1;i<k;i++){
            sum = total(sum);
        }
        return sum;
    }
    public int total(int n){
        int sum = 0;
        while(n!=0){
            sum+= (n%10);
            n/=10;
        }
        return sum;
    }
}