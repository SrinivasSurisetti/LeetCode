class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq1 = new int[1001];
        int[] freq2 = new int[1001];
        int[] res = new int[Math.min(nums1.length,nums2.length)];
        int index = 0;   
        for(int num : nums1) freq1[num]++;
        for(int num : nums2) freq2[num]++;
        for(int i = 0;i<freq1.length;i++){
            int count = Math.min(freq1[i],freq2[i]);
            for(int j = 0;j<count;j++) res[index++]=i;
        }
        return Arrays.copyOf(res,index);
    }
}