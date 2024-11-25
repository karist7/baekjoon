import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        answer = new int[numbers.length];
        
        for(int i=numbers.length-1;i>=0;i--){
            while(!stack.isEmpty()){
                int d = stack.peek();
                if(d<=numbers[i]){
                    stack.pop();
                }
                else{
                    answer[i] = d;
                    break;
                }
            }
            if(stack.isEmpty())
                answer[i] = -1;
            stack.push(numbers[i]);
        }
        
        
        return answer;
    }
}