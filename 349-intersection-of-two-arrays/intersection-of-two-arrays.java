class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> nums2Set = new HashSet<>();
        for(int num : nums2){
            nums2Set.add(num);
        }
        for(int ele : nums1){
            if(nums2Set.contains(ele)){
                set.add(ele);
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(int setEle : set){
            result[index++] = setEle; 
        }
        return result;
    }
}