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
    public ListNode mergeNodes(ListNode head) {
        ListNode dumy = new ListNode(1); // Create a dummy node to simplify list construction
        ListNode cur = dumy;  // Pointer to build the new list
        int sum = 0;
        head = head.next; // Skip the initial zero node
        while(head!=null){
            if(head.val == 0) {
                cur.next = new ListNode(sum);
                cur = cur.next;
                sum = 0;
            }
            else {
                sum += head.val;
            }
            head = head.next;
        }
        return dumy.next;// Return the new list, skipping the dummy node 1st val[ListNode(1)]
    }
}