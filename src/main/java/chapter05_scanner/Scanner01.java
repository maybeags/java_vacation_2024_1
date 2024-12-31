package chapter05_scanner;

import java.util.Scanner;

/*
    chapter05_scanner 패키지 생성
    Scanner01.java 클래스 생성 -> main 메서드 적용
 */
public class Scanner01 {
    public static void main(String[] args) {
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);       // 콘솔창에 사용자가 값을 입력할 수 있음.
//        System.out.print("올해 년도를 입력하세요 >>> ");    // print와 println 앞으로 구분하겠습니다.
//        int year = scanner.nextInt();
//        System.out.println("올해 년도는 " + year + "년 입니다.");

//        String year1 = scanner.nextLine();
//        System.out.println("올해 년도는 " + year1 + "년 입니다.");
//        System.out.println("내년 년도는 " + year1 + 1 + "년 입니다.");       // 내년 년도는 20241년 입니다.
        // -> year1을 String으로 선언했기 때문에 수학 연산이 불가능해져서 2024를 입력했을 경우 20241로 출력됨.

        // scanner를 사용하게 될 때 데이터를 저장할 변수의 '자료형이 매우 중요'합니다.

        /*
            14, 17번 라인에서의 중요한 점 :

                scanner.nextInt() / scanner.nextLine()을 이용하면 콘솔창에 사용자가 원하는 값을 입력 가능
                그리고 그 결과값을 각각 int year / String year1에 대입했습니다.

                즉 결과값이 변수에 대입이 됐음을 의미함 -> 22번 라인과 합쳐서 저희가 생각해야 점 :
                    애초에 변수를 선언하면서 어떤 자료형이 될지 고려하면 자동완성으로 nextInt() / nextDouble() /
                    nextLine() 등이 완성됩니다.
         */
//        double tempNum = scanner.nextDouble();
        // Scanner02.java 클래스를 만들어주세요 -> main 메서드 적용
    }
}
