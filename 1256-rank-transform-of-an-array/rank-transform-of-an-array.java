class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ar = arr.clone();
        int[] rankar = new int[arr.length];
        Arrays.sort(ar);
        int rank = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : ar){
            if(!map.containsKey(ele)){
                map.put(ele,rank++);
            }
        }
        for(int i = 0;i<arr.length;i++){
            rankar[i] = map.get(arr[i]);
        }
        return rankar;
    }
}