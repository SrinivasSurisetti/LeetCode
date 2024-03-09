import java.util.HashSet;

public class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> commonElements = new HashSet<>();

        // Add elements of nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Check for common elements with nums2 and store them
        for (int num : nums2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }

        // Find the minimum common element
        if (!commonElements.isEmpty()) {
            int min = Integer.MAX_VALUE;
            for (int num : commonElements) {
                min = Math.min(min, num);
            }
            return min;
        }
        
        return -1; // If no common element found
    }
}

// import java.util.ArrayList;
// import java.util.Iterator;

// public class Solution {
//     public int getCommon(int[] nums1, int[] nums2) {
//         ArrayList<Integer> commonElements = new ArrayList<>();
        
//         for (int num1 : nums1) {
//             for (int num2 : nums2) {
//                 if (num1 == num2) {
//                     commonElements.add(num1);
//                     break;
//                 }
//             }
//         }

//           if (!commonElements.isEmpty()) {
//             int min = Integer.MAX_VALUE;
//             for (int num : commonElements) {
//                 if (num < min) {
//                     min = num;
//                 }
//             }
//             return min;
//         }
        
//         return -1; // If no common element found
//     }
// }

// class Solution {
//     public int getCommon(int[] nums1, int[] nums2) {
//         int len = nums1.length + nums2.length;
//         ArrayList<Integer> newArray = new ArrayList<>();
//         for(int i=0;i<nums1.length;i++){
//             newArray.add(nums1[i]);
//         }
//         for(int j=0;j<nums2.length;j++){
//             newArray.add(nums2[j]);
//         }
//         int flag  = Integer.MAX_VALUE;
//         while(flag!=0){
//             int min = Integer.MAX_VALUE;
//             for(int minVal : newArray){
//                 if(minVal < min){
//                     min = minVal;
//                 }
//             }
//             if(checkMin(nums1,min) && checkMin(nums2,min)){
//                 return flag = 0;
//             }
//             else {
//                 Iterator<Integer> iterator = newArray.iterator();
//                 while(iterator.hasNext()){
//                     iterator.remove();
//                 }
//             }
//         }
//         if(flag==0) {
//             return min;
//         }
//         else{
//             return -1;
//         }
// }
//     public boolean checkMin(int[] arr,int min){
//     for(int ele1 : arr){
//         if(min == ele1){
//             return true;
//         }
//     }
//     return false;
//     }
// }