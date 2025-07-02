## 📘 문제 이름
약수의 합

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12931)

---

### 🧠 문제 설명
정수 n을 입력받아 n의 각 자릿수의 합 구하기
---

### 💡 아이디어
- 1. 나눗셈 활용 
n % 10으로 일의 자리 추출 후 n / 10으로 일의 자리 제거 <- 이 방식 반복,
추출한 값들 answer에 넣고 더하기

- 2. 문자열로 변환 활용
Integer.toString(n)으로 문자열로 변환 -> str에 넣기
for문으로 str 길이만큼 반복하고 substring으로 각 자릿수 추출 (정수로 변경하는 parseInt 꼭 사용하기)

---

### 배운 것, 느낀 점, 아직 이해되지 않은 점 (선택)

---

### 다른 사람의 풀이

### 내 코드에서 while문을 true로, 일의 자리를 추출하는 과정에 if문으로 나머지가 10보다 작아졌을 때 (한 자리 숫자가 되었을 때)  break 실행


```java

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(true){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}

```
