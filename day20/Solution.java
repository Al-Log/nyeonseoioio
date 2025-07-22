package day20;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        list.remove(Collections.min(list));
        
        if (list.isEmpty()) {
            list.add(-1);
            
        }
        int[] answer = new int[list.size()];
        
        for (int i=0;i< list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}