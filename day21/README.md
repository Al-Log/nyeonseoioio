## 📘 문제 이름
수박수박수박수박수박수?

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12922)

---

### 🧠 문제 설명
길이가n이고, "수박수박수.."와 같은 패턴을 유지하는 문자열을 리턴하는 함수를 작성하기
---



### 💡 아이디어
- 1. 인덱스를 2로 나누어서 나머지가 0이 되는 부분은 수로, 1이 되는 부분은 박으로 출력하도록 함 -> for문과 if문 사용 

---



### 다른 사람의 풀이


```java


class Solution {
  public String solution(int n) {
       StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            answer.append(i%2==0?"박":"수");
        }
        return answer.toString();
  }
}

```
