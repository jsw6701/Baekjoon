import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, Integer> pbook = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++){
            pbook.put(phone_book[i], i);
        }
        
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book[i].length(); j++){
                if(pbook.containsKey(phone_book[i].substring(0, j))){
                    answer = false;
                }
            }
        }
        
        return answer;
    }
}