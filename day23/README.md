## 📘 문제 이름
직사각형 별찍기

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12969)

---

### 🧠 문제 설명
(*)문자를 이용해 가로가 n, 세로가 m인 직사각형 형태를 출력하는 함수 작성하기
---



### 💡 아이디어
- 1. 두 개의 for문 활용

---



### 다른 사람의 풀이


```java

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String star = "";
        for(int i=1; i<=a; i++){
            star += "*";
        }
        for(int i=1; i<=b; i++){
            System.out.println(star);
        }
    }
}

```
