## 📘 문제 이름
약수의 합

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12912)

---

### 🧠 문제 설명
정수 a와 b 사이 모든 정수의 합을 리턴하는 함수 작성
---



### 💡 아이디어
- 1. if문으로 a가 b보다 클 때와 이외의 상황으로 나눔
- 2. a보다 b가 더 클 때, a에서부터 b까지 더하는 for문 작성, b보다 a가 더 클 때도 마찬가지


---
### 배운 것, 느낀 점, 아직 이해되지 않은 점 (선택)

- 1. 다른 사람들의 코드를 보면서 다양한 수학 공식을 활용할 생각을 해야 할 것 같다. 

---

### 다른 사람의 풀이

- 1. Math.min과 Math.max를 사용해서 대소 관계 나누고
- 2. sumAtoB에서 등차수열의 합 공식을 사용해 두 수 사이의 합 구함.

```java
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
```
