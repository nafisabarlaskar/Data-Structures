package LinkedList;

import Nodes.Node;
/**
 * Created by NafisaBarlaskar on 04-03-2017.
 */
public class MthElementFromTheEnd {

    public static void getMthElementFromEnd(int positionNumber, Node root) {

        Node slowTemp = root;
        Node fastTemp = root;

        for (int i = 0; i < positionNumber; i++) {
            if (fastTemp != null) {
                fastTemp = fastTemp.getNext();
            }
        }
        while (fastTemp != null) {
            slowTemp = slowTemp.getNext();
            fastTemp = fastTemp.getNext();
        }

        System.out.println("The element is " + slowTemp.getData());
    }

    public static void main(String[] args) {

        //generate the linkedlist
        Node root = new Node();
        root = null;

        for (int i = 0; i < 7; i++) {
            root = Node.addLast(root, i);
        }

        getMthElementFromEnd(2,root);
    }
}