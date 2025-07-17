## 📘 문제 이름
콜라츠 추측

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12943)

---

### 🧠 문제 설명
1-1. 입력된 수가 짝수라면 2로 나눔
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더함
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복
---



### 💡 아이디어
- 1. while문으로 num이 1이 될떄까지 순회
- 2. if -else문으로 num이 짝수일 때와 홀수일 때로 나눔
- 3. 500번 돌았으면 answer를 -1 값으로 해서 순회를 멈춤

---

## 배운 것, 느낀 점, 아직 이해되지 않은 점 

- 1. 쉬운 문제였는데 너무 복잡하게 생각했다 if-else문 쓸 생각만 하지 말고 다른 조건문도 활용해서 문제 풀어보도록 해야 함.


### 다른 사람의 풀이



```java
class Solution {
    public int solution(long num) {
        int answer = 0;

        while(num != 1){
            answer++;
            if(answer==500)
                return -1;
            if(num%2==0){
                num/=2;
            }else{
                num=num*3+1;
            }
        }
        return answer;
    }
}

```
