package chapter05_scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 입력 : ");
        int x = scanner.nextInt();

        System.out.print("y 입력 : ");
        int y  = scanner.nextInt();

        System.out.println("x + y = " + x + y);     // 이 경우 x와 y가 맨 앞의 문자열 때문에 String으로 인식
        System.out.println("x + y = " + ( x + y )); // 때문에 올바른 연산을 위해서는 소괄호를 이용할 수 있음.
        /*
            java 우클릭 -> new -> package -> chapter06_conditions
            chapter06_conditions 우클릭 -> new -> java class -> Condition01.java 생성 -> main 메서드 적용
         */
    }
}
