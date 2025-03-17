class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int count = 0;
        Set<Integer> uniq = map.keySet(); 
        for(int ele : uniq){
            if(map.get(ele)%2==0) count+=map.get(ele)/2;
        }
        return count==nums.length/2;
    }
}