## 📘 문제 이름
크기가 작은 부분 문자열

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/147355)

---

### 🧠 문제 설명
숫자로 이루어진 문자열 t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 작성하라
---



### 💡 아이디어
- 1. p와 t의 길이가 서로 다르기 때문에 p와 t의 문자열 길이를 뺴고 length를 +1한 값을 지정

- 2. for문을 통해 length만큼 반복하고 substring을 통해 문자열을 잘라서 temp에 담음

- 3. temp의 값이 p보다 작으면 answer++



---



### 다른 사람의 풀이

- 1. for문에 바로 p 문자열과 t 문자열의 길이를 뺌

- 2. 그 이후 나와 동일한 방법 

```java

class Solution {
  public int solution(String t, String p) {
        int pLength = p.length();
        long pValue = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i <= t.length() - pLength; i++) {
            long tValue = Long.parseLong(t.substring(i, i + pLength));
            if (tValue <= pValue)
                answer++;
        }
        return answer;
    }
}
```