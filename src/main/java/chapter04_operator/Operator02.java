package chapter04_operator;
/*
    논리 연산자

    true(1), false(0) : 컴퓨터가 읽을 수 있는 두 숫자
    boolean : true / false를 구분하는 자료형

    AND(&&) -> 곱 T x T = T // T x F = F // F x F = F => 하나라도 false라면 false
    OR(||) -> 합 T + T = T // T + F = T // F + F = F => 하나라도 true라면 true
    NOT(!) -> 값을 반대로 바꿔준다. 혹은 틀릴 경우를 나타냄 -> 추후 수업 예정
    boolean flag = false;
    sout(!flag);        => true 출력됨
 */
public class Operator02 {
    public static void main(String[] args) {
//        boolean flag = false;
//        System.out.println(!flag);

        // 변수 선언 및 초기화
        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;    // AND 연산자 활용 : 곱연산
        System.out.println("T x T = " + result1);

        boolean result2 = flag1 && flag2;
        System.out.println("T x F = " + result2);

        boolean result3 = flag2 && flag2;
        System.out.println("F x F = " + result3);

        boolean result4 = flag1 || flag1;   // OR 연산자 활용 : 합연산
        System.out.println("T + T = " + result4);

        boolean result5 = flag1 || flag2;
        System.out.println("T + F = " + result5);

        boolean result6 = flag2 || flag2;
        System.out.println("F + F = " + result6);

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F x F = " + result7);

        boolean result8 = 10 % 3 == 0;      // 10 % 3의 결과값이 0이면 true / 아니라면 false가 return
        System.out.println("10 % 3 == 0 ? : " + result8);

        boolean result9 = 10 % 3 != 0;      // 10 % 3의 결과값이 0이면 false / 아니라면 true return
        System.out.println("10 % 3 != 0 ? : " + result9);
        /*
            44-48 라인까지의 코드에서 중요한 점은 'a와 b가 같다'를 자바로 표현할 때는
            a = b가 아니라 a == b로 작성하는 점

            Operator03.java -> main
         */
    }
}
