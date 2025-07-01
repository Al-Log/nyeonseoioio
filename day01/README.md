## 📘 문제 이름
약수의 합

- 🧩 난이도: Lv.1
- 🛠 사용 언어: Java
- [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12928)

---

### 🧠 문제 설명
정수 n을 입력받아 n의 약수의 합을 구하는 문제.

---

### 💡 아이디어
- 입력 받을 수 있는 Scanner 클래스 호출
- main 함수에 Scanner 객체 생성 / solution 함수 호출
- 입력 받은 정수와 하나씩 늘어나는 i값을 나누어 입력 받은 정수의 약수를 파악 후 answer 변수에 더함.

---

### 배운 것, 느낀 점, 아직 이해되지 않은 점 (선택)

---

### 다른 사람의 풀이

# for문에서 num/2 까지만 수행하는 이유 : num의 약수 중 자신을 제외한 값은 무조건 num/2 이하임.
# ex | 18의 약수 : 1 2 3 6 **9** 18 
# 이런 성질을 이용하여 반복 횟수 줄이기

class SumDivisor {
    public int sumDivisor(int num) {
        int answer = 0;
    for(int i =1 ; i<=num/2;i++){
      if(num%i==0){
        answer+=i;}}


        return answer+num;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        SumDivisor c = new SumDivisor();
        System.out.println(c.sumDivisor(12));
    }
}
