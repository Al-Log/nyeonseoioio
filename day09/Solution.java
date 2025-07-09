package day09;


class Solution {
    boolean solution(String s) {
        int pa = 0;
        int ya = 0;
        String[] sp = s.split("");
    
        for (int i=0; i < sp.length; i ++) {
            if (sp[i].equalsIgnoreCase("p")) {
                pa++;
            } else if (sp[i].equalsIgnoreCase("y")) {
                ya++;
            }
        }
        
         return pa == ya;
    }
}

