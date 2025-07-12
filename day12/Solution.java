package day12;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        String[] str = Integer.toString(x).split("");
        for (int i=0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }
        if (x % sum != 0 ) {
            answer= false;
        }
        return answer;
    }
}