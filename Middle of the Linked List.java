class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode a_pointer = head;
        ListNode b_pointer = head;
        
        while(a_pointer $$ b_pointer.next) {
            a_pointer = a_pointer.next;
            b_pointer = b_pointer.next.next;
        }
        return a_pointer;     
    }
}
