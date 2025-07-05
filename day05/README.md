## 📘 문제 이름
약수의 합

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12954)

---

### 🧠 문제 설명
정수 x와 자연수 n을 입력받아 x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트 리턴하는 함수 만들기
---

### 💡 아이디어
- 1. 배열을 크기 n으로 초기화 (new long[n])
- 2. for문으로 자연수 n 크기의 리스트를 출력하도록 하고, answer 배열에 x씩 증가하는 코드 작성


---
### 배운 것, 느낀 점, 아직 이해되지 않은 점 (선택)

- 1. 사칙 연산을 할 때에는 무조건 같은 타입이여야 식이 성립됨.

---

### 다른 사람의 풀이

- 1. 처음부터 answer 배열의 첫 원소값을 x로 지정 후 for문 시작
- 2. for문 내부 식 : answer[i] = answer [i-1] + x;
```java

import java.util.*;

class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}

```
