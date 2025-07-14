## 📘 문제 이름
없는 숫자 더하기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/86051)

---

### 🧠 문제 설명
0부터 9까지 숫자 중 배열(0 ~ 9 숫자 중 일부)에 없는 수를 찾아서 더하기
---



### 💡 아이디어
- 1. 0~ 9 총합인 45에서 배열에 있는 수 합을 빼기


---

### 다른 사람의 풀이

- 1. for ( int  i : numbers ) :     배열 numbers의 각 요소를 순회



```java
class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}


```
