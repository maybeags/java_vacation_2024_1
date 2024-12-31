package chapter04_operator;
/*
    package명은 소문자로 작성
    Class명은 대문자로 시작

    실수한거 우클릭 -> rename / refactor
    코드 작성하는 부분에서 직접 수정할 경우 파일명과 코드가 일치하지않아 컴파일링 실패가 일어납니다.
 */
public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;
        System.out.println(i);

        // 대입 연산자 : '=' : = 오른쪽 데이터를 = 왼쪽의 변수에 대입한다는 의미

        i = i + 1;
        System.out.println(i);

        /*
            복합 대입 연산자

            1) +=
            2) -=
            3) *=
            4) /=
         */
        // 변수 선언 및 초기화
//        int num = 1;
//        System.out.println(num);
//        num += 2;                       // num = num + 2;
//        System.out.println(num);
//        num -= 1;                       // num = num - 1;
//        System.out.println(num);
//        num *= 10;                      // num = num * 10;
//        System.out.println(num);
//        num /= 5;                       // num = num / 5;
//        System.out.println(num);

        int j = 10;
        System.out.println(j);
        System.out.println(j++);    // 출력값 10 변수명++ : 코드를 실행시키기 '후'에 j에 1을 더할 것.
        System.out.println(j);      // 출력값 11
        System.out.println(++j);    // 출력값 12 ++변수명 : 코드를 실행시키기 '전'에 j에 1을 더할 것
        System.out.println(j);      // 출력값 12
        System.out.println(j--);    // 출력값 12 변수명-- : 코드를 실행시키기 '후'에 j에 1을 뺄 것
        System.out.println(j);      // 출력값 11
        System.out.println(--j);    // 출력값 10 --변수명 : 코드를 실행시키기 '전'에 j에서 1을 뺄 것
        System.out.println(j);      // 출력값 10

        /*
            일반 수식 연산자
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지 연산자         -> return값의 자료형은 int
         */
        System.out.println("10 / 2 의 나머지 : " + 10%2);
        System.out.println("10 / 3 의 나머지 : " + 10%3);
    }
}
