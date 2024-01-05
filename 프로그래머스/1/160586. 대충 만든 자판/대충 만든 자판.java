import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character,Integer> map=new HashMap<>();
    
        for(int i=0;i<keymap.length;i++){
            for(int j=0;j<keymap[i].length();j++){
                char c=keymap[i].charAt(j);
                if(map.get(c)==null){
                    map.put(c,j);
                }else if(map.get(c)>j){
                    map.put(c,j);
                }
                
            }
        }
        
        for(int i=0;i<targets.length;i++){
            for(int j=0;j<targets[i].length();j++){
                char c=targets[i].charAt(j);
                if(map.containsKey(c)){
                    int cnt=map.get(c)+1;
                    answer[i]+=cnt;
                }else{
                    answer[i]=-1;
                    break;
                }
            }            
        }
        
        return answer;
    }
}