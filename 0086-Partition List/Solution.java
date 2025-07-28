class Solution {
    public ListNode partition(ListNode head, int x) {
                // Dummy heads of the two partitions
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);

        // Current tails of the before and after lists
        ListNode before = beforeHead;
        ListNode after = afterHead;

        // Traverse original list
        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        // Cut from the end of after list
        after.next = null;

        // Connect before list with after list
        before.next = afterHead.next;

        // Return the start of the partitioned list
        return beforeHead.next;

        
    }
}