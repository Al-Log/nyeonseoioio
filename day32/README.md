## 📘 문제 이름
달리기 경주

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/178871)

---

### 🧠 문제 설명
선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 작성하라


---



### 💡 아이디어
- 1. answer 배열을 players로 지정하고 해설진들이 말한 배열 callings의 길이만큼 for문 돌림
- 2. for문 내부에는 달리기 순위를 업데이트하는 코드




- 실행은 되지만 런타임 에러가 걸림 -> 런타임 에러를 줄일 수 있는 방법을 찾아야 함






---



### 다른 사람의 풀이

- 1. HashMap의 get메소드를 사용해서 호출된 선수의 등수를 빠르게 찾음

- 2. put 메소드로 등수 업데이트

```java

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            int called = map.get(callings[i]);
            
            map.put(players[called], called - 1);
            map.put(players[called - 1], called);
            
            players[called] = players[called - 1];
            players[called - 1] = callings[i];
        }
        return players;
    }
}

```