import java.util.*;

class Solution {
    
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, -1, 0, 1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int[][] visited = new int[maps.length][maps[0].length];
        
        visited[0][0] = 1;
        
        bfs(maps, visited);
        
        answer = visited[maps.length-1][maps[0].length-1];
        
        if(answer == 0){
            answer = -1;
        }
        
        return answer;
    }
    
    public void bfs(int[][] maps, int[][] visited){
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        
        while(!q.isEmpty()){
            int[] current = q.poll();
            int pastX = current[0];
            int pastY = current[1];
            
            for(int i = 0; i < 4; i++){
                int moveX = pastX + dx[i];
                int moveY = pastY + dy[i];
                
                if(moveX >= 0 && moveY >= 0 && moveX <= maps[0].length-1 && moveY <= maps.length-1){
                    if(visited[moveY][moveX] == 0 && maps[moveY][moveX] == 1){
                        visited[moveY][moveX] = visited[pastY][pastX] + 1;
                        q.add(new int[]{moveX, moveY});
                    }
                }
            }
        }
        
        
        
    }
}