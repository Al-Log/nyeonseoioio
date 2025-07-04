## 📘 문제 이름
약수의 합

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12937)

---

### 🧠 문제 설명
정수 num이 짝수일 경우 "Even", 홀수일 경우 "Odd"를 반환하는 함수 작성
---

### 💡 아이디어
- 1. if문을 통해 num % 2가 0이면 answer = "Even" , 아니면  answer = "Odd"


---


### 다른 사람의 풀이

```java
public class Solution {
    String evenOrOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    // public static void main(String[] args) {
    //     Solution evenOrOdd =  new Solution();
    //     System.out.println()
    // }
}

```
