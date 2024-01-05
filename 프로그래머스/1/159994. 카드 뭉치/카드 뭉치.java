import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        
        int next1=0;
        int next2=0;
        for(String word:goal){
            if(next1<cards1.length&&word.equals(cards1[next1])){
                next1++;
            }else if(next2<cards2.length&&word.equals(cards2[next2])){
                next2++;
            }else{
                answer="No";
                break;
            }
          
            
        }
        
        
        return answer;
    }
}