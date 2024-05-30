import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Deque<Character> deque = new ArrayDeque<>();
        deque.addLast(s.charAt(0));
        
        for(int i=1; i<s.length(); i++){            
            if(!deque.isEmpty() && deque.peekLast() == '(') {
                if(s.charAt(i) == ')') {
                    deque.removeLast();
                }
                else {
                    deque.addLast(s.charAt(i));
                }
            }
            else {
                deque.addLast(s.charAt(i));
            }
        }
        
        if(!deque.isEmpty()) answer = false;

        return answer;
    }
}