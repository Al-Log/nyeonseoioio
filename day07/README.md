## 📘 문제 이름
약수의 합

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12925)

---

### 🧠 문제 설명
문자열 s를 숫자로 변환하는 함수 작성하기
---

### 💡 아이디어
- 1. Integer.parseInt 활용


---

### 다른 사람의 풀이

- 1. Interger.valueOf(str) : 문자열 -> 정수
- 2. Integer.parseInt(str) : 문자열 -> 정수
```java

class Solution {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.valueOf(s);
        return answer;
    }
}
```
