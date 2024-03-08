class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> arr = new HashMap<>();
        for(int element : nums){
            if(arr.containsKey(element)){
                arr.put(element,arr.get(element)+1);
            }
            else {
                arr.put(element,1);
            }
        }
        int maxCount = Integer.MIN_VALUE;
        for(int count : arr.values()){
            if(count>maxCount){
                maxCount = count;
            }
        }
        //Checking if count == max count
        int sum = 0;
        for(int checkingCount : arr.values()){
            if(checkingCount == maxCount){
                sum+=checkingCount;
            }
        }
        return sum;
    }
}