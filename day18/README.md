## 📘 문제 이름
핸드폰 번호 가리기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12948)

---

### 🧠 문제 설명
phone_number가 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 "*"로 가린 문자열을 리턴하는 함수를 작성
---



### 💡 아이디어
- 1. for문으로 phone_number 길이만큼 순회
- 2. if문으로 phone_number의 길이에서 -4를 한 것보다 작으면 문자열 answer에 "*"으로 넣음
- 3. 그게 아니라면 phone_number 그대로 삽입

---

## 배운 것, 느낀 점, 아직 이해되지 않은 점 

- 1. 배운 점 :  char charAt(int index): 문자열의 특정 인덱스에 있는 문자를 반환하는 메서드 -> index를 작성하는 것 기억하기 


- 2. 다른 사람 풀이를 보면서 느낀 점 :  밑의 방식처럼 작성하면 굳이 뒷 4자리 숫자에 대해 작성할 필요 없고 코드가 간결해짐... 


### 다른 사람의 풀이
- 1. char형 배열 ch로 변경

- 2. for문으로 ch길이 -4 만큼 반복하면서 ch[i] = "*"



```java

class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}
  

```
