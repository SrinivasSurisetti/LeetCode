class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String s : arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String[] countar = new String[arr.length];
        int ind = 0;
        for(String s : arr){
            if(map.get(s)==1){
                countar[ind++] = s;
            }
        }
        if(k>ind){
            return "";
        }
        else{
            return countar[k-1];
        }
    }
}