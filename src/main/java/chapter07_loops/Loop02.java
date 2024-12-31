package chapter07_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            n에 숫자를 입력하여 몇 번 반복할지 정하고 1부터 n까지 더하는 반복문을 작성하세요.

            실행 예
            1부터 몇까지 더하시겠습니까? >>> 10
            합은 55입니다.
         */

        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        System.out.print("1부터 몇 까지 더하시겠습니까? >>> ");
        n = scanner.nextInt();

        // for 반복문을 작성하여 완성하세요.
//        for(int i = 0 ; i < n ; i++) {
//            sum += (i+1);
//        }

        for(int i = 1 ; i < n + 1 ; i++) {
            sum += i;
        }


        System.out.println("합은 " + sum + "입니다.");
        // 그래서 내년 1회차에 정보처리기(능)사를 칠 예정이시라면 동시에 SQLD도 준비해보세요
        // 정보처리기(능)사 필기 및 실기 3과목에 SQL문 있어서 동시에 따기 쉽습니다.
    }
}
