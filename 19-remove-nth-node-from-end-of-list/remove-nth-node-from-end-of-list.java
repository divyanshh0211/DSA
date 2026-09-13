class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int sz = 0;
        ListNode temp = head;

        // Calculate size
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // If removing the first node
        if (n == sz) {
            return head.next;
        }

        int i = 1;
        int iToFind = sz - n;

        ListNode prev = head;

        // Reach the node before the one to remove
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // Remove the node
        prev.next = prev.next.next;

        return head;
    }
}