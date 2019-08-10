package LinkedList;

public class FlattenList {

    public class Node{
        int val;
        Node next;
        Node prev;
        Node child;
        public  Node(int val){
            this.val = val;
            this.child = null;
            this.next = null;
            this.prev = null;
        }
    }
    public Node flatten(Node head) {
        if(head == null){
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        return flattenNode(dummy.next);

    }

    public Node flattenNode(Node p){
        Node node = p;
        while(node != null){
            if(node.child != null){
                Node next = node.next;
                Node q = flattenNode(node.child);
                node.child = null;
                q.prev = node;
                node.next = q;
                while(node.next != null){
                    node = node.next;
                }
                if(next != null)next.prev = node;
                node.next = next;
            }
            node = node.next;
        }
        return p;
    }
}
