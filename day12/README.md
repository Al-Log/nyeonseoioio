## 📘 문제 이름
하샤드 수

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12947)

---

### 🧠 문제 설명
하샤드 수 맞으면 true, 아니면 false를 리턴하는 함수 
---



### 💡 아이디어
- 1. 문자열로 변환하여 각 자릿 수의 합을 구함
- 2. if문으로 나머지가 0이 아니면 answer값을 false로 설정하도록 함.


---

### 다른 사람의 풀이

- 1. String.valueOf(x)로 문자열로 변환
- 2. .chars() : 유니코드 값(문자 자체를 나타내는 정수값)으로 변환하여 스트림으로 반환
- 3. .map(ch -> ch - '0') : 유니코드 값을 실제 숫자로 변환 ( 유니코드 값에서 '0'의 유니코드 값을 빼야 실제 숫자 값으로 변환됨.)
- 4. 변환된 숫자 총합 구하기

```java
class Solution {
    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    }
}


```
