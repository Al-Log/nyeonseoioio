# 문제 풀이 과정 정리본 샘플
아래 내용을 복사 붙여넣기하여 수정해서 사용하세요!


## 📘 문제 이름
두수의 합 구하기

- 🧩 난이도: level 1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12944)

---

### 🧠 문제 설명
배열 arr의 평균값을 return하는 함수 만들기

---

### 💡 아이디어
- for문을 통해 배열의 각 원소들을 answer 변수에 더하기
- for문 실행을 마치면 answer의 값을 arr.length로 나누기


---


### 다른 사람의 풀이

```java
import java.util.Arrays;

// stream 메서드를 활용 -> 배열을 스트림으로 변환하면 필터링, 매핑, 평균 계산 가능
public class GetMean {
    public int getMean(int[] array) {
        return (int) Arrays.stream(array).average().orElse();

    }
}



```