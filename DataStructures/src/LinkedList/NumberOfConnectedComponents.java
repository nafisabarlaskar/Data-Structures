package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class NumberOfConnectedComponents {

    public int numComponents(ListNode head, int[] G) {

        Set<Integer> set = new HashSet<>();
        for(int g : G){
            set.add(g);
        }

        ListNode curr = head;
        int count = 0;
        while(curr != null){
            if(set.contains(curr.val) && (curr.next == null || !set.contains(curr.next.val))){
                count++;
            }
            curr = curr.next;
        }
        return count;
    }
}
