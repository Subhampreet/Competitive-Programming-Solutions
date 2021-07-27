// This question is asked by Microsoft. Given a linked list, containing unique numbers, return whether or not it has a cycle.
// Note: a cycle is a circular arrangement (i.e. one node points back to a previous node)

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        
        return false;
    }
}