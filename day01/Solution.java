package day01;

import java.util.Scanner;

    public class Solution {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(solution(n));
        }
        
        public static int solution(int n) {
            int answer = 0;
            for (int i = 1; i <= n; i++ ) {
                if (n % i == 0) {
                    answer =answer+i;
                }
            }
            return answer;
        }
}
