## 📘 문제 이름
내적

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/70128)

---

### 🧠 문제 설명
길이가 같은 정수 배열 a,b가 매개변수로 주어지고 a,b의 내적을 return하는 solution 함수를 완성하라
---



### 💡 아이디어
- 1. for문으로 a,b 배열을 순회하면서 곱함

---



### 다른 사람의 풀이


```java

class Solution {
     public int solution(int[] a, int[] b) {
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            int multiple = a[i] * b[i];
            total += multiple;
        }
        System.out.println(total);
        return total;
    }
}

```