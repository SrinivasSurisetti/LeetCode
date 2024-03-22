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
    public boolean isPalindrome(ListNode head) {
        ListNode ptr = head;
        boolean ispalindrome = true;
        Stack<Integer> stack = new Stack<>();
        while(ptr!=null){
            stack.push(ptr.val);
            ptr = ptr.next;
        }
        while(head!=null){
            int stackTop = stack.pop();
            if(stackTop == head.val){
                ispalindrome = true;
            }
            else{
                ispalindrome = false;
                break; 
            }
            head = head.next;
        }
        return ispalindrome;
    }
}