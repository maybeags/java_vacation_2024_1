package chapter07_loops;

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isEmpty = true;

        while(isEmpty) {
            System.out.print("insert number in int n >>> ");
            int n = scanner.nextInt();

            if(n != 0) {
                isEmpty = false;
//                break;
            }

            System.out.println("value of the int n : " + n);
        }
    /*
        이상의 while 반복문에서 확인할 수 있는 점은
        break; 명령어와 isEmpty = false의 작동 방식이 다르다는 점입니다.

        1) break;
            : break;가 실행되는 그 즉시 while 반복문이 break; 밑의
                코드들을 실행시키지 않고 종료
        2) isEmpty = false;
            : 변수의 데이터는 true에서 false로 바뀌었지만
                while(조건식)을 적용하는 시점까지 나머지 반복실행문을
                전부 실행시키고 전체 반복문 종료
     */
    }
}
/*
    chapter08_methods 패키지 생성하고,
    Method01.java 클래스를 만드세요
 */