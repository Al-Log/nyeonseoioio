## 📘 문제 이름
문자열 내 p와 y의 개수

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12916)

---

### 🧠 문제 설명
String s에 p의 개수와 y의 개수를 비교해 같으면 true, 다르면 false를 리턴하는 Solution 함수 작성
 
 * p,y 모두 없는 경우는 항상 true를 리턴
---



### 💡 아이디어
- 1. String s를 split()를 이용해 문자열 자르기
- 2. for문으로 문자열 자른 배열 순회하면서 단어 내 p, y 개수 파악
- 3. return pa == ya로 개수 비교 후 true, false 리턴


---
### 배운 것, 느낀 점, 아직 이해되지 않은 점 (선택)

- 1.  equalsIgnoreCase("-")를 활용하면 대소문자 구별하지 않음 

---

### 다른 사람의 풀이

## 람다식 활용 

- 1. toUpperCase()를 활용해 문자열을 모두 대문자로 변환
- 2. s.char() : 문자열을 IntStream으로 변환 ( 문자들을 유니코드 값으로 처리)
     예: "PPOOOYY".chars() → [80, 80, 79, 79, 79, 89, 89] ('P'의 유니코드 값은 80, 'Y'는 89)

- 3. .fliter(e -> 'P' == e).count(); : 'P'와 같은 문자만 필터링 후 갯수 세기

```java
class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
```
