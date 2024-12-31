package chapter03_conversion;

public class Main {
    public static void main(String[] args) {
        /*
            Conversion 형변환 -> 용량 상의 문제로 일어나는 이슈를 해결하기 위해서 사용함.

                1) upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환시키는 것.
         */
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 업캐스팅의 1번째 방법
        // 형 변환을 하기 위해서는 '(바꿀데이터타입) 변수명'으로 작성하면 됩니다.
        System.out.println("변형 : " + (int)cast1);       // A를 int로 바꾸면 65인데 시험에 자주 나옴

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2);       // a를 int -> 97
        // 업캐스팅의 2번째 방법
        char cast3 = 'b';
        // 업캐스팅을 진행할 변수를 새로운 '자료형 변수명 = 기존 변수;' 형태로 작성
        int cast4 = cast3;                      // 변수는 재대입이 가능하다는 점을 들어서 새로운 변수 선언 및 초기화
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + cast4);

        // 2) 다운캐스팅(downcasting : 더 적은 용량의 자료형으로 변환시키는 것)
        int cast5 = 99;         // 1번 방법 사용할 것
        int cast6 = 100;        // 2번 방법 사용할 것
        // 지시 사항 다운캐스팅하는 방법을 업캐스팅 방식 1, 2를 동원해서 char 형태로 바꾼 후, 콘솔창에 원형과 변형을 다 출력하세요.

        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " + (char)cast5);

//        char cast7 = cast6;             // 해당 방식을 사용할 경우 오류가 발생합니다. upcasting과 downcasting 성격 차이 때문

        char cast7 = (char)cast6;

        System.out.println("원형 : " + cast6);
        System.out.println("원형 : " + cast7);

        /*
            추후 수업할 예정이긴 하지만 간단하게 말씀드리자면
            upcasting의 경우는 메모리 용량이 커지기만 하는 거기 때문에 기본적으로 '암시적(implicit)'으로 변형 가능
            downcasting의 경우에는 메모리 용량을 벗어나게 되는 경우가 있습니다. 용량 오버에 해당하는 현상을 미리 점검하기 위해
                다운캐스팅을 할 경우에는 '명시적(explicit)'으로만 변형이 가능합니다. 그렇기 때문에
                upcasting 방식 - 2번과 완벽히 동일하게 downcasting이 일어나지 않습니다(chapter14에서 다시 한 번 다룰 예정)

            chapter04_operator 패키지 생성
            Main.java 클래스 생성 -> main 메서드 적용
         */
    }
}
