import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < arr.length; i++){
            if(i == 0) stack.push(arr[0]);
            else{
                if(stack.peekLast() != arr[i]) stack.addLast(arr[i]);
            }
        }
        
        answer = new int[stack.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = stack.removeFirst();
        }
        
        return answer;
    }
}