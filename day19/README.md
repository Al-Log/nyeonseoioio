## 📘 문제 이름
가운데 글자 가져오기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12903)

---

### 🧠 문제 설명
단어 s의 가운데 글자를 반환하는 함수 solution을 작성하기 (짝수일 때는 가운데 두 글자)
---



### 💡 아이디어
- 1. if문으로 문자열의 길이가 2로 나누어서 나머지가 0이면(짝수) 문자열의 길이를 2로 나누고 -1 한 몫과 2로 나눈 몫 위치의 값 추출 | 그외에는 (홀수) 문자열의 길이를 2로 나눈 몫 위치의 값 추출

- 2. 추출할 때 charAt 활용

---

## 배운 것, 느낀 점, 아직 이해되지 않은 점 

- 1. 코딩에서 항상 인덱스 처음은 0부터 시작한다는 것을 간과함. 



- 2. substring(int start, int end) : 문자열을 지정한 범위만큼 잘라서 반환 
     -> java.lang.String 패키지 내부에 있음
    만약 substring(int start)만 작성한다면 시작 인덱스부터 끝까지 반환
  

- 3. if문을 한 줄로 작성하는 방법도 활용해보아야겠다.
   조건 ?  참일 때 코드 : 거짓일 때 코드

### 다른 사람의 풀이
- 1. 문자열을 배열로 변환 후 작성하는 방법

- 2. substring 사용하는 방법



```java

class Solution {
    public String solution(String s) {
        String result = "";
        int len = s.length();
        int middle = s.length() / 2;
        
        return s.length() % 2 == 0 ? s.substring(middle - 1, middle + 1) : s.substring(middle, middle + 1)
;
    }
}
  

```
