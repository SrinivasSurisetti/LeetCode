class Solution {
    public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<nums.length;i++){
                int ele = target - nums[i];
                if(map.containsKey(ele)){
                    return new int[] { map.get(ele),i };
                }
                map.put(nums[i],i);
            }
        throw new IllegalArgumentException("Bye");
    }
}