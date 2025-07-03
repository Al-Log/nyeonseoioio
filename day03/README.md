## 📘 문제 이름
약수의 합

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12932)

---

### 🧠 문제 설명
자연수 n을 뒤집어 각 자리의 숫자를 원소로 가지는 배열로 만들기
---

### 💡 아이디어
- 1. String 문자열로 변환 후 strArr이라는 배열에 집어넣고, strArr.length로 strArr 길이 만큼의 answer 배열을 만든다
for문을 통해 원소의 뒷부분 부터 answer 배열에 넣는다. 


---

### 배운 것, 느낀 점, 아직 이해되지 않은 점 (선택)
strArr를 Integer.parseInt 해야 하는 것 잊지 않기

---

### 다른 사람의 풀이

```java

// lenth만 가져오기 

public class Solution {
   public int[] solution(long n) {
        int length = Long.toSring(n).length();

        int[] answer = new int[length];

        for (int i = 0 ; i < answer.length ; i++) {
            answer[i] = (int) (n % 10);
            n=n/10;
        }
    return answer;
   }
}

```
