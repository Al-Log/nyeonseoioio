## 📘 문제 이름
정수 내림차순으로 배치하기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12933)

---

### 🧠 문제 설명
매개변수인 정수 n의 각 자릿수를 큰 수부터 작은 수 순으로 정렬한 새로운 정수를 리턴하는 함수 작성하기
---



### 💡 아이디어
- 1. 문자열 형태로 변환 후 내림차순으로 정렬
- 2. Collection 클래스를 활용하여 순서 바꾸기
- 3. 배열 내 원소들 합치기 -> String.join("", str);
- 4. 문자열을 Long타입으로 변환 후 리턴 

---
### 배운 것, 느낀 점, 아직 이해되지 않은 점 

- 1.  Collections 클래스는 정렬, 최댓값/최솟값 찾기, 요소 뒤집기, 요소 섞기, 불변 컬렉션(수정할 수 없는 리스트 생성)과 같은 작업들을 쉽게 수행할 수 있도록 함.

예 :  Collections.reverseOrder(); -> 내림차순 정렬


- 2. 배열과 컬렉션의 차이

(1) 배열 : 정적 크기, 동일한 데이터 타입

(2) 컬렉션 : 동적 크기, 다양한 데이터 타입


---

### 다른 사람의 풀이

### 📝 for-each문, StringBulider 사용

- 1. n을 문자열 배열로 변환 후 오름차순 정렬
- 2. StringBulider 객체 생성
- 3. for ( String aList : list ) -> list의 각 요소들을 하나씩 순회하며 aList에 담음 
- 4. 그 후에 sb 객체에 aList를 추가



```java
import java.util.*;

class Solution {
  public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
  }
}
```
