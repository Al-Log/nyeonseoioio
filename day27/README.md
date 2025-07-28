## 📘 문제 이름
숫자 문자열과 영단어

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java)

---

### 🧠 문제 설명
숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열s가 매개변수로 주어지는데 s가 의미하는 원래 숫자를 RETURN하는 solution 함수를 작성하기
---



### 💡 아이디어
- 1. if문으로 여러 개 사용
- 2. String.contains(), String.replace()를 사용하여 각 영어로 된 숫자가 있는 지 확인 후 숫자로 표기되도록 변환


---



### 다른 사람의 풀이

- 1. 배열로 처리...

```java

class Solution {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
} 

```