/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        if(head== null || head.next==null)
            return head;
        while(temp.next!=null)
        {
            stack.push(temp.val);
            temp=temp.next;
        }
        stack.push(temp.val);
        
        ListNode rev = head ;
        while(!stack.isEmpty())
        {
            rev.val=stack.pop();
            rev=rev.next;
        }
    
        return head;
    }
}