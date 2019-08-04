package Stack;

public class MinStack {
    public class Node{
        int val;
        int min;
        Node next;

        public Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }

    Node top;
    public void push(int num){
        if(top == null){
            top = new Node(num, num);
        }else{
            Node n = new Node(num, Math.min(num, top.min));
            n.next = top;
            top = n;
        }
    }

    public int pop(){
        if(top == null){
            return  -1;
        }
        Node n = top.next;
        top.next = null;
        int val = top.val;
        top = n;
        return val;
    }

    public int peek(){
        if(top == null){
            return  -1;
        }
        return top.val;
    }

    public int getMin(){
        if(top == null){
            return  -1;
        }
        return top.min;
    }

}


