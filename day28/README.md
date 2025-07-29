## 📘 문제 이름
두 개 뽑아서 더하기 

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/68644)

---

### 🧠 문제 설명
정수 배열 numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오른차순으로 담아 return 하도록 solution 함수를 작성하라
---



### 💡 아이디어
- 1. ArrayList 이용하고 이중 for문을 활용해서 서로 인덱스가 다른 배열에 담음 

- 2. Array.sort()로 배열 원소 오른차순 정렬


---



### 다른 사람의 풀이



```java

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0 ; i < numbers.length; i++){
            for(int j = i+1 ; j < numbers.length; j++){
                int tmp = numbers[i] + numbers[j];
                if(!list.contains(tmp)){
                    list.add(tmp);
                }
            }   
        }

        int size = 0;
        answer = new int[list.size()];
        for(int num : list){
            answer[size++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}

```