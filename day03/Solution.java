package day03;

class Solution {
    public int[] solution(long n) {

        String str = new String(n+"");
        String strArr[] = str.split("");
        
        int[] answer = new int[strArr.length];
        
        for (int i = 0 ; i < strArr.length ; i ++) {
            answer[i] = Integer.parseInt(strArr[strArr.length-1-i]);
}
        
        return answer;
    }
}