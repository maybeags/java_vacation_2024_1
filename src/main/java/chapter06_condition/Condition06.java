package chapter06_condition;

public class Condition06 {
    public static void main(String[] args) {
        /*
            삼항 연산자
            정의 : 조건식을 평가하여 true 혹은 false 여부에 따라서 두 가지 표현식 중 하나를 선택적으로 실행
            형식 :

            조건식 ? 표현식1 : 표현식2

            조건식 : true 혹은 false로 평가 가능한 식(if문 처음부터 배웠던 부분입니다)
            표현식1 : 조건식이 true일 때 실행되는 식
            표현식2 : 조건식이 false일 때 실행되는 식
         */

        int a = 5;
        int b = 3;

        int max = (a > b) ? a : b;  // a가 b보다 크다면 a의 값을 max라는 변수에 대입
                                    // 아니라면 b의 값을 max라는 변수에 대입

        System.out.println("더 큰 수는 " + max + "입니다.");

        int c = 90;
        int d = 120;
        int max2;

        if (c > d) {
            max2 = c;
        } else {
            max2 = d;
        }
        System.out.println("더 큰 수는 " + max2 + "입니다.");
    }
}
