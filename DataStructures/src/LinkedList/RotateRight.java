package LinkedList;

public class RotateRight {

    public ListNode rotateRight(ListNode head, int k){
        ListNode p = head, q = null;
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode tail = head;
        int size = 0;
        while(tail != null){
            size++;
            tail = tail.next;
        }

        int diff = size - k%size;
        if(size == diff){
            return head;
        }
        tail = head;
        int i = 0;
        while(i < diff){
            i++;
            p = tail;
            tail = tail.next;
        }
        q = p.next;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = head;
        p.next = null;
        head =  q;

        return head;
    }
}
