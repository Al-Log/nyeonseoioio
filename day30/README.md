## 📘 문제 이름
이상한 문자 만들기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12930)

---

### 🧠 문제 설명
한 개 이상의 단어로 구성되어 있는 문자열 s은 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 작성하라.


---



### 💡 아이디어
- 1. 공백으로 나눈 배열 str 정의
- 2. for문으로 str길이만큼 순회 | if문으로 짝수자리면 대문자, 홀수자리 소문자로 str배열에 넣음




---



### 다른 사람의 풀이


```java

import java.lang.StringBuilder;
class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sb.charAt(i) == ' ') {
                count = 0;
            } else if (count % 2 == 0) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                count++;
            } else {
                count++;
            }
        }
        String answer = sb.toString();
        return answer;
    }
}

```