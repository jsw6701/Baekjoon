import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participants = new HashMap<>();
        
        for(String tmp : participant){
            participants.put(tmp, participants.getOrDefault(tmp, 0) + 1);
        }
        
        for(String tmp : completion){
            participants.put(tmp, participants.get(tmp) - 1);
        }
        
        for(String tmp : participants.keySet()){
            if(participants.get(tmp) != 0){
                answer = tmp;
            }
        }
        return answer;
    }
}