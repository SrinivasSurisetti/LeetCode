class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String ele : details){
            int age = Integer.parseInt(ele.substring(11,13));
            if(age>60){
                count++;
            }
        }
        return count;
    }
}