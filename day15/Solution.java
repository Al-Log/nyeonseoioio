package day15;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        List<Integer> newList = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                newList.add(arr[i]);
            }  
        }
        if (newList.isEmpty()) {
                return new int[]{-1};
        }
        
        int[] answer = new int[newList.size()];
        for (int i =0 ; i < answer.length; i ++) {
            answer[i] = newList.get(i);
            

        }
        Arrays.sort(answer);

        return answer;
    }
    
}

