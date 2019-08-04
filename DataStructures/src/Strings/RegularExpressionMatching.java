package Strings;

public class RegularExpressionMatching {

    public boolean isMatch(String text, String pattern){
        if(pattern == null || pattern.isEmpty()){
            return false;
        }

        boolean isMatch = ((!text.isEmpty() && text.charAt(0) == pattern.charAt(0) )|| pattern.charAt(0) == '.');

        if(pattern.length() > 2 && pattern.charAt(1) == '*'){
            return (isMatch && isMatch(text.substring(1), pattern)) || isMatch(text, pattern.substring(2));
        }else{
            return isMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }
}
