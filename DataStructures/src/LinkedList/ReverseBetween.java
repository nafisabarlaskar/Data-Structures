package LinkedList;

public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(head == null || head.next == null || m >= n){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;

        for(int i = 0; i < m-1; i++){
            pre = pre.next;
        }

        ListNode start = pre.next;
        ListNode next = start.next;

        for(int i = 0; i < n-m; i++){
            start.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = start.next;
        }

        return dummy.next;

    }
}
