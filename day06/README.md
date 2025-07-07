## 📘 문제 이름
약수의 합

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/87389)

---

### 🧠 문제 설명
자연수 n이 매개변수로 주어지고 n을 x로 나눈 나머지 값이 1이 되는 가장 작은 x값을 return하는 Solution 함수 만들기
---

### 💡 아이디어
- 1. for문으로 x가 1일 때부터 자연수 n까지 순회하도록 함
- 2. for문 내부에 if문을 작성하여 n과 x를 나누었을 때 나머지가 1인 가장 작은 x값을 발견하면 바로 x값을 리턴하도록 함.


---

### 다른 사람의 풀이

```java

class Solution {
    public int solution(int n) {
        int answer = 1;

        while(n % answer !=1) {
            answer++;
        }

        return answer;
    }
}

```
