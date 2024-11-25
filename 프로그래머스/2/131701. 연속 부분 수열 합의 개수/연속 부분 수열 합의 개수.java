import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int total=0;
        for(int i:elements){
            map.put(i,1);
            total+=i;
        }
        map.put(total,1);
        
        for(int i=2;i<elements.length;i++){
            
            for(int j=0;j<elements.length;j++){
                total=0;
                for(int k=j;k<j+i;k++){
                    total+=elements[k%(elements.length)];
                }    
                map.put(total,1);
            }
        }
        
        
        answer = map.size();
        return answer;
    }
}