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
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev= null;
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            prev = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        ListNode FromMiddleNode = prev.next;
        
        return FromMiddleNode;
    }
}