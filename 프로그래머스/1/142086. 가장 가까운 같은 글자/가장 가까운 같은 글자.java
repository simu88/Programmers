import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0]=-1;

        for(int i=1;i<s.length();i++){
            char c1=s.charAt(i);
            int gap=-1;
            for(int j=0;j<i;j++){
                char c2=s.charAt(j);
                if(c1==c2){
                    gap=i-j;
                }
                
            }
            
                answer[i]=gap;
            
        
        }
        
        
        return answer;
    }
}