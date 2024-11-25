import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<tangerine.length;i++){
            if(map.containsKey(tangerine[i])){
                map.put(tangerine[i],map.get(tangerine[i])+1);
            }
            else{
                map.put(tangerine[i],1);
            }
        }
        List<Integer> arr = new ArrayList<>(map.values());
        Collections.sort(arr,Collections.reverseOrder());
        
        int total=0;
        for(int i=0;i<arr.size();i++){
            total+=arr.get(i);
            answer++;
            if(total>=k)
                break;
            
        }
        
        return answer;
    }
}