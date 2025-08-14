class Solution {
    public String largestGoodInteger(String num) {
        if(num.length() < 3) return "";
        String maxGood = "";
        for(int i = 0;i<num.length()-2;i++){
            char a = num.charAt(i);
            char b = num.charAt(i+1);
            char c =num.charAt(i+2);
            if(a==b && b==c){
                String current = num.substring(i,i+3);
                if(maxGood.equals("") || current.compareTo(maxGood) > 0){
                    maxGood = current;
                }
            }
        }
        return maxGood;
    }
}