package chapter08_methods;
// 안근수 maybeags
// 010-7445-7113
public class Overloading {
    /*
        method overloading
            매개변수의 형태가 다르면 동일한 메서드 명을 가지고 정의할 수 있다.

            즉, 메서드 명은 동일하고, parameter에 들어가는 자료형 및 변수명이 다르다.

            overloading의 장점 :
                동일한 기능을 하는 메서드를 정의할 때 메서드 명이 필요한데,
                예를 들어 String type끼리 연결해주는 메서드와
                int 끼리 합 연산을 하는 메서드를 나누었을 때 각각 메서드 명이 필요하다면
                add,
                plus,
                connect
                다음 메서드 명은 무엇으로 할까요?

                특정한 메서드명을 지정한다면, 그 뒤로
                해당 메서드를 호출할 때, 알아서 데이터 타입에 맞게 argument가 설정됩니다.

     */

    // call1() 타입의 메서드 정의
    public static void add() {
        System.out.println("add()");
    }

    // call2() 타입의 메서드 정의 -> method명 / return type은 동일 | ()안만 다른 상황
    public static void add(String s) {
        System.out.println("add(String s)");
    }

    // call2() 타입의 메서드 정의 -> parameter의 자료형뿐만 아니라 개수도 자유
    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
    }

    public static void add(String s, int a) {
        System.out.println("add(String s, int a)");
    }

    public static void add(int a, String s) {   // 매개변수 순서만 달라도 overloading
        System.out.println("add(int a, String s)");
    }
}