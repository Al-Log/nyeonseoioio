## 📘 문제 이름
약수의 합

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12934?language=java)

---

### 🧠 문제 설명
n이 양의 정수 x의 제곱이면 x+1의 제곱을 리턴, 아니면 -1을 리턴하는 함수 만들기
---



### 💡 아이디어
- 1. Math.sqrt()를 활용해서 제곱근 연산 
- 2. if문으로 양의 정수 x의 제곱이라면 x+1 * x+1을 리턴
- 3. 아니면 -1 리턴 하도록 작성 


---

### 다른 사람의 풀이

- 1. Math.pow(대상 숫자. 지수)를 활용한 식 구성



```java

class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
}
```
