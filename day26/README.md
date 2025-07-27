## 📘 문제 이름
문자열 다루기 기본

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](hhttps://school.programmers.co.kr/learn/courses/30/lessons/12918?language=java)

---

### 🧠 문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수 solution을 작성하라
---



### 💡 아이디어
- 1. if문으로 문자열 길이가 4 혹은 6이 아닌 것을 false 출력하도록 함
- 2.ASCII 값이 0부터 9까지 숫자로 이루어져 있는지 확인하는 for문을 사용 -> answer = false 출력


---



### 다른 사람의 풀이


```java

class Solution {
  public boolean solution(String s) {
     int length = s.length();
        if (length != 4 && length != 6)
            return false;
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            if (c < '0' || c > '9')
                return false;

        }
        return true;
  }
}

```