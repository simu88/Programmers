import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        
        Map<String,Integer> ranks=new HashMap<>();
        for(int i=0;i<players.length;i++){
            ranks.put(players[i],i);
        }
        
        for(int i=0;i<callings.length;i++){
            String calledPlayer=callings[i];
            int calledRank=ranks.get(calledPlayer);
            String frontPlayer=answer[calledRank-1];
            
            answer[calledRank]=frontPlayer;
            answer[calledRank-1]=calledPlayer;
            
            ranks.put(calledPlayer,calledRank-1);
            ranks.put(frontPlayer,calledRank);
        
        }
        
        
        
        return answer;
    }
}