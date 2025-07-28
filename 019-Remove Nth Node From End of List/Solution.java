class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode firstPtr = dummy;
    ListNode secondPtr = dummy;

    // Move secondPtr n spaces ahead
    for (int i = 0; i < n; i++) {
      secondPtr = secondPtr.next;
    }

    // Move both now, until the next of secondPtr gets to null
    while(secondPtr.next != null) {
      firstPtr = firstPtr.next;
      secondPtr = secondPtr.next;
    }

    // We now have to remove the node next of firstptr or we can say we have to skip that    pointer
    firstPtr.next = firstPtr.next.next;

    return dummy.next;
        
    }
}