## 📘 문제 이름
나누어 떨어지는 숫자 배열

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12910)

---

### 🧠 문제 설명
arr의 각 원소 중에 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 solution 함수를 작성하기

** divisor로 나누어 떨어지는 원소가 하나도 없다면 배열에 -1을 담아 반환
---



### 💡 아이디어
- 1.리스트를 활용하여 동적 할당할 수 있도록 함.
- 2. isEmpty()를 사용하여 비어있다면 배열에 -1을 담아 리턴하도록 작성

- 3. .sort() - > 오름차순 정렬

---

### 배운 것, 느낀 점, 아직 이해되지 않은 점 

- 1. 배운 점 : ** 배열에 -1을 담아 반환하라 ** -> new int []{-1};



---


### 다른 사람의 풀이

- 1. Stream 활용하여 나머지가 0인 원소 추출, 배열로 변환까지 한 줄로 작성




```java
import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int divisor) {
          int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          java.util.Arrays.sort(answer);
          return answer;
  }
}

```
