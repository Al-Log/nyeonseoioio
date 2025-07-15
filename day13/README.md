## 📘 문제 이름
음양 더하기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/76501)

---

### 🧠 문제 설명
정수들의 절댓값을 담은 정수 배열 absolutes와 정수들의 부호를 담은 불리언 배열 signs가 주어지는데 실제 정수들의 합을 구하여 리턴하는 함수 작성하기
---



### 💡 아이디어
- 1. 각 요소가 true이면  aabsolute[i]를 더하고 false면 빼도록 한다


---

### 다른 사람의 풀이


```java
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        return answer;
    }
}

```
