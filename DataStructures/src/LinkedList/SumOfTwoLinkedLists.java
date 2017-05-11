package LinkedList;

import Nodes.Node;

/**
 * Created by NafisaBarlaskar on 21-04-2017.
 */
public class SumOfTwoLinkedLists {

    public static Node reverseLinkedList(Node head){

        Node root = head;

        if (head == null){
            return null;
        }

        if(head.getNext() == null){
            return head;
        }

        Node current = head;
        Node previous = null;
        Node next = null;

        while(current!= null){
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        return previous;
    }

    public static int getLengthOfLinkedList(Node head){

        Node root = head;
        int length = 0;

        while(root != null){
            length++;
            root = root.getNext();
        }
        return length;
    }

    public static Node addLinkedList(Node head1, Node head2){

        Node res = null;
        if(head1 == null || head2 == null)
            return null;

        int sum = 0;
        int carry = 0;

        Node list1 = null;
        Node list2 = null;

        if (getLengthOfLinkedList(head1) > getLengthOfLinkedList(head2)){
            list1 = reverseLinkedList(head1);
            list2 = reverseLinkedList(head2);
        } else {
            list1 = reverseLinkedList(head2);
            list2 = reverseLinkedList(head1);
        }

        while(list1!=null || list2!=null){

            if(list1 == null){
                list1.data = 0;
            }
            if(list2 == null){
                list2.data = 0;
            }
            sum = list1.data + list2.data + carry;
            carry = sum/10;

            Node result = new Node();
            result.setData(sum%10);
            result.setNext(res);
            res = result;
            list1 = list1.getNext();
            list2 = list2.getNext();
        }

        reverseLinkedList(res);
        return res;
    }

    public static void main(String[] args){

        Node root1 = new Node();
        Node root2 = new Node();

        for (int i = 1; i < 7; i++) {
            root1 = Node.addLast(root1, i);
        }

        for (int j = 1; j < 5; j++) {
            root2 = Node.addLast(root2, j);
        }

        Node addedList = addLinkedList(root1,root2);

        while(addedList!=null){
            System.out.println(addedList.getData());
        }
    }
}
