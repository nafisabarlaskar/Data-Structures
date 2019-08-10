package LinkedList;

public class ReorderList {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode n1 = head;
        ListNode n2 = n1, slow = n1, fast = n1;

        while (fast != null && fast.next != null) {
            n2 = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        if (n2 != null) {
            n2.next = null;
        }

        ListNode prev = null, next = slow, curr = slow;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while (n1 != null) {
            n2 = n1.next;
            n1.next = prev;
            prev = prev.next;
            if (n2 != null) {
                n1.next.next = n2;
            } else {
                n1.next.next = prev;
            }
            n1 = n2;
        }
    }
}
