package Nodes;

/**
 * Created by NafisaBarlaskar on 04-03-2017.
 */
public class Node {

    public int data;
    Node next = null;

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public static Node addLast(Node header, int data) {
        // save the reference to the header so we can return it.
        Node root = header;

        // check base case, header is null.
        if (header == null) {
            Node newNode = new Node();
            newNode.setData(data);
            newNode.setNext(null);
            return newNode;
        }

        // loop until we find the end of the list
        while ((header.getNext() != null)) {
            header = header.getNext();
        }

        // set the new node to the Object x, next will be null.
        Node nextNode = new Node();
        nextNode.setNext(null);
        nextNode.setData(data);
        header.setNext(nextNode);
        return root;
    }

    public static Node getMiddleOfLinkedList (Node root){
        Node header = root;
        Node fast = root;
        Node slow = root;

        while (fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow;
    }

    public static Node getMthElementFromEnd (Node root, int m){
        Node header = root;
        Node fast = root;
        Node slow = root;

        for(int i = 0; i < m && fast!=null; i++){
            fast = fast.getNext();
        }

        while (fast.getNext()!=null){
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return slow;
    }

}
