package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    Map<Character, Character> map = new HashMap<>();

    public void createMappings(){
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
    }

    public boolean isValid(String parenthesis){
        if(parenthesis == null || parenthesis.isEmpty() || parenthesis.length() == 0){
            return false;
        }
        createMappings();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < parenthesis.length(); i++){
            char c = parenthesis.charAt(i);
            if(map.containsKey(c)){
                char p = stack.isEmpty() ? '#': stack.pop();
                if(p != map.get(c)){
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
