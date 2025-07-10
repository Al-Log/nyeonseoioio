package day10;


import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] str= Long.toString(n).split("");
      
        Arrays.sort(str,Collections.reverseOrder());
        
        String reverseStr = String.join("",str);
        
        answer = Long.parseLong(reverseStr);
        return answer;
    }
}

