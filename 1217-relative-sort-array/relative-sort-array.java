class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1007];
        for(int num : arr1){
            freq[num]++;
        }
        int i=0;
        for(int num :arr2){
            while(freq[num]>0){
                arr1[i] = num;
                freq[num]--;
                i++;
            }
        }
        for(int j=0;j<freq.length;j++){
            while(freq[j]>0){
                arr1[i] = j;
                freq[j]--;
                i++; 
            }
        }
        return arr1;
    }
}