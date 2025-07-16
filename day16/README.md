## 📘 문제 이름
서울에서 김서방 찾기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12919)

---

### 🧠 문제 설명
배열 seoul의 원소 중 "Kim"의 위치 x를 찾아서 "김서방은 x에 있다"는 String을 반환하는 함수를 작성 

---



### 💡 아이디어
- 1. for문으로 배열을 순회
- 2. for문 내 if문으로 "Kim"의 위치 찾기

---

### 배운 것, 느낀 점, 아직 이해되지 않은 점 

- 1. 계속 문자열 비교할 때 "=="을 사용하는데 .equals를 사용하여 비교해야 한다는 점 잊지 말기


---


### 다른 사람의 풀이



```java
import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int idx = Arrays.asList(seoul).indexOf("Kim");
        
        return String.format("김서방은 %d에 있다", idx);
    }
}

```
