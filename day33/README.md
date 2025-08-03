## 📘 문제 이름
부족한 금액 계산하기 

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/82612)

---

### 🧠 문제 설명
원래 놀이기구의 이용료는 price, 놀이기구를 n번째 사용한다면 이용료xn을 함, 놀이기구를 count 번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마나 모자라는지를 return하는 solution 함수를 작성하기


---



### 💡 아이디어
- 1. for문으로 놀이기구를 탄 횟수만큼 반복하고 입장료로 사용한 총 금액을 sum 변수에 담음

- 2. answer는 내 돈 money와 sum의 차익를 계산한 값

- 3. return문에 sum보다 money가 더 크면 0을, 아니면 answer의 절댓값을 반환하도록 함.




---



### 다른 사람의 풀이


```java

class Solution {
    public long solution(long price, long money, long count) {
    	
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}

```