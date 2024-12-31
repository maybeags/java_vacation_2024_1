package chapter05_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
            문자열 입력
            next()      -> 띄어 쓰기 포함 x
            nextLine()  -> 띄어 쓰기 포함 o
         */

        String name = "안근수";
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);

//        input("프롬프트 작성")  -> python

//        System.out.print("프롬프트 작성 예시 : 당신의 이름은 무엇입니까? >>> ");
//        자료형 변수명 = scanner.nextLine();
//        name = scanner.next();          // name 변수에 값을 재 대입하기 때문에 자료형 생략

        /*
            실행 예

            이름을 입력하세요 >>> 여러분이름
            주소를 입력하세요 >>> 여러분 주소(시 / 구까지)
            나이를 입력하세요 >>> 여러분 나이

            이름 : 여러분이름
            주소 : 여러분 주소
            나이 : 여러분 나이(20)
            내년 나이 : 여러분 나이 + 1(21)
         */
        // 질문이 먼저 나오고 뒤에 변수명 = 데이터 대입
        System.out.print("이름을 입력하세요 >>> ");
        String name1 = scanner.next();
        // enter키를 막아줄 배리어 역할
        scanner.nextLine();     // nextLine()은 엔터 키를 기준으로 입력문을 받아들이기 때문에
                                // 39번 라인의 scanner.nextLine()이 엔터키를 받음
                                // 하지만 이 데이터는 아무 변수에도 대입되지 않기 때문에 사라짐.
        System.out.print("주소를 입력하세요 >>> ");
        String address = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");     // 질문을 받는 부분은 전부 print()
        int age = scanner.nextInt();                 // 대답 부분에서는 전부 println()

        System.out.println();       // 콘솔창에서 한 칸 띄우기 위해서 사용하는 비어있는 println()
        System.out.println("이름 : " + name1);
        System.out.println("주소 : " + address);
        System.out.println("나이 : " + age);
        int nextAge = age + 1;      // 내년 나이를 입력하기 위해 새로운 변수 선언 및 초기화
        System.out.println("내년 나이 : " + nextAge);       // 해결 방법 1
        System.out.println("내년 나이 : " + (age + 1));     // 해결 방법 2 : 출력명령어보다 소괄호 안의 연산이 우선적으로 이루어짐
        }
}
/*
    next() vs nextLine()
        1. 입력 단위 : next()는 공백 이전까지의 단어를 읽고(띄어쓰기 불가),
            nextLine()은 줄바꿈 이전까지의 전체 문자열을 읽는다(enter 기준).
        2. 1.로 인한 문제점 : next() 다음에 nextLine()을 혼합하여 쓰게 됐을 때,
            nextLine()을 호출 하기 전에 next()를 사용하면, next()를 입력하고 난 후에 친
            enter키로 인해 nextLine()이 입력을 무시하고 다음 코드라인을 읽어들이면서 빈 문자열만
            저장되어 변수에 아무것도 대입하지 않을 수가 있음.
        3. 해결 방법 : 2.는 java 상에서의 대표적인 scanner 관련 문제로, 이를 막기 위해 enter키를
            흡수해주는 배리어를 코드라인으로 삽입할 필요가 있음.

 */