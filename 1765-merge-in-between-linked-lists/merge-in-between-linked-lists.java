/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1; 
        for(int i=0;i<a-1;i++){
            head = head.next; 
        }
        ListNode end = head;
        for(int i = 0;i<=b-a+1;i++){
            end = end.next;
        }
        head.next = list2;
        ListNode list2End = list2;
        while(list2End.next != null){
            list2End = list2End.next;
        }
        list2End.next = end;
        return list1;
    }
}