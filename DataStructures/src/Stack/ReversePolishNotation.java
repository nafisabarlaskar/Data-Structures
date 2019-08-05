package Stack;

import java.util.Stack;

public class ReversePolishNotation {

    public int evaluate(String[] tokens){
        int a;
        int b;
        Stack<Integer> stack = new Stack<>();
        for(String i : tokens){
            if(i.equals("+")){
                stack.add(stack.pop()+stack.pop());
            }else if(i.equals("-")){
                a = stack.pop();
                b = stack.pop();
                stack.add(b - a);
            }else if(i.equals("*")){
                stack.add(stack.pop()*stack.pop());
            }else if(i.equals("/")){
                a = stack.pop();
                b = stack.pop();
                stack.add(b / a);
            }else{
                stack.add(Integer.parseInt(i));
            }
        }
        return stack.pop();
    }
}
