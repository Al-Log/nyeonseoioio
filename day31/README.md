## 📘 문제 이름
소수 찾기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12921)

---

### 🧠 문제 설명
1부터 입력 받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수 solution을 작성하라


---



### 💡 아이디어
- 1. Math.sqrt() 활용 : 루트 하는 메소드






---



### 다른 사람의 풀이

- 1. isPrime 사용 : 소수 판별 알고리즘 활용

```java

class Solution {
    public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=2; i<n+1; i++) {
            if(this.isPrime(i)) {
                answer++;
            }
                
        }
        
        return answer;
    }
}

```