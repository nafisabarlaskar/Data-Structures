package LinkedList;

import Nodes.Node;

import java.util.Scanner;

/**
 * Created by NafisaBarlaskar on 05-03-2017.
 */
public class MthElementFromEndAndStart {

    public static void main(String[] args){

        Node root = new Node();
        root = null;
        System.out.println("Enter the values of the linked list: (-999 to end)");

        for (int i = 0; i < 5; i++) {
            root = Node.addLast(root, i);
        }

        Node node = root;
        int counter = 0;
        while (node!=null){
            counter++;
            node = node.getNext();
        }

        if(counter%2==1){
            Node middle = Node.getMiddleOfLinkedList(root);
            System.out.println("Mth element is " +middle.getData());
        } else {
            System.out.println("No such element");
        }


    }

}
