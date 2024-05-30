import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i=0; i<progresses.length; i++) {
            queue.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(!queue.isEmpty()) {
            int value = queue.poll();
            int finish = 1;
            
            while(!queue.isEmpty() && value >= queue.peek()) {
                finish++;
                queue.poll();
            }
            list.add(finish);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}