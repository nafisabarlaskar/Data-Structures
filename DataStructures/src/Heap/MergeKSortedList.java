package Heap;

import LinkedList.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {

   public ListNode mergeKSortedLists(ListNode[] listNodes){
       PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
           @Override
           public int compare(ListNode o1, ListNode o2) {
               return o1.val - o2.val;
           }
       });
       ListNode head = new ListNode(0);
       ListNode p = head;
       for(ListNode node : listNodes){
           queue.offer(node);
       }

       while(!queue.isEmpty()){
           ListNode n = queue.poll();
           p.next = n;
           if(n.next != null){
               queue.offer(n.next);
           }
           p = p.next;
       }
       return head.next;
   }

}
