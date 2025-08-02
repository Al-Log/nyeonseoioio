package day32;

import java.util.List;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        List<String> arr = Arrays.asList(players); 
        
        for (int i = 0; i < callings.length; i++) {
            int rank = arr.indexOf(callings[i]); 
            String name = players[rank - 1];    
            players[rank - 1] = players[rank]; 
            players[rank] = name;
        }
        
        return players; 
    }
}