package day31;

class Solution {
	public int solution(int n) { 
		int answer = 1; 
		
		
		for (int i = 3; i <= n; i++) { 
			int count = 0; 
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) { 
				answer++; 
			}
		}
		return answer;
	}
}