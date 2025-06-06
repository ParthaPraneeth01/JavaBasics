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
        Stack<Integer> stack = new Stack<>();
        ListNode curr=head;
        ListNode temp=head;
        while(curr!=null){
            stack.push(curr.val);
            curr=curr.next;
        }
        while(temp!=null){
            if(stack.pop()!=temp.val){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
}
