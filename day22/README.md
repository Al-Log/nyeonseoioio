## 📘 문제 이름
문자열 내림차순으로 배치하기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12917)

---

### 🧠 문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수 solution 작성하기
---



### 💡 아이디어
- 1. ""로 분리해서 배열 str을 만듦.
- 2. Collections.reserve()와 Arrays.sort를 사용해서 배열 str을 오름차순으 후 내림차순으로 정렬
- 3. for문으로 내림차순 정렬한 str을 answer에 넣기

---



### 다른 사람의 풀이

- 1. StringBuilder 활용

```java

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] chArray = s.toCharArray();
        Arrays.sort(chArray);
        StringBuilder tmp = new StringBuilder(new String(chArray));
        answer = tmp.reverse().toString();
        return answer;
    }
}

```
