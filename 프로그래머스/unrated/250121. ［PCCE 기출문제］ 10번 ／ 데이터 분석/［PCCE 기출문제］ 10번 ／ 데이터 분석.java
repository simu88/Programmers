import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer;
        
        List<int[]> list=new ArrayList<>();
        
        for(int[] row:data){
            if(ext.equals("code")&&row[0]<val_ext){
                     list.add(row);
                }else if(ext.equals("date")&&row[1]<val_ext){
                   list.add(row);
                }else if(ext.equals("maximum")&&row[2]<val_ext){
                  list.add(row);
                }else if(ext.equals("remain")&&row[3]<val_ext){
                  list.add(row);
                }
        }
        
           if(sort_by.equals("code")){
            Collections.sort(list,Comparator.comparing(row0->row0[0]));
        }else if(sort_by.equals("date")){
           Collections.sort(list,Comparator.comparing(row1->row1[1]));
        }else if(sort_by.equals("maximum")){
            Collections.sort(list,Comparator.comparing(row2->row2[2]));
        }else if(sort_by.equals("remain")){
            Collections.sort(list,Comparator.comparing(row3->row3[3]));
        }
    
        
        answer= new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}