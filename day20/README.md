## 📘 문제 이름
제일 작은 수 제거하기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12935)

---

### 🧠 문제 설명
배열 arr에서 가장 작은 수를 제거한 배열을 리턴하는 함수 solution 작성하기
---



### 💡 아이디어
- 1. ArrayList 클래스로 list 정의
- 2. 배열 arr를 list에 순서대로 넣기
- 3. Collections 클래스를 활용해서 최솟값 제거 (Collections.min(list))
- 4. if문으로 list가 비어있다면(is.Empty()) list에 -1 추가
- 5. list 사이즈에 맞게 배열 생성 후 for문으로 값 천천히 넣기 (answer[i] = list.get(i))

---

## 배운 것, 느낀 점, 아직 이해되지 않은 점 

- 1. List와 ArrayList의 차이 :
     List -> 인터페이스 ( 기능만 정의 ) , ArrayList로 선언하는 것보다 더 유연하고, 나중에 다른 리스트로 쉽게 변경 가능
     ArrayList -> 클래스 ( 기능을 실제로 구현 )


### 다른 사람의 풀이


```java


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
  public int[] solution(int[] arr) {
      if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        } else {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int a : arr) {
                arrayList.add(a);
            }
            Integer minimum = Collections.min(arrayList);
            arrayList.remove(minimum);
            int[] resultArray = new int[arr.length - 1];
            for (int i = 0; i < arrayList.size(); ++i) {
                resultArray[i] = arrayList.get(i);
            }
            return resultArray;
        }
  }
}
  

```
