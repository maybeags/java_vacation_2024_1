package chapter07_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
            별찍기를 통한 for 문 구조 학습
            *               i 0이고, j 0일 때 별이 하나만 찍혀야 함
            **              i 1이고, j 0일 때 하나, 1일 때 한 번
            ***             i 2, j 0, 1, 2일 때 하나씩
            ****            i 3, j 0, 1, 2, 3
            *****           i 4, j 0, 1, 2, 3, 4
            i의 값이 바뀔 때 마다 개행(줄바꿈)이 일어나야 함.
         */
//        for( int i = 0 ; i < 5 ; i++) {
//            for( int j = 0 ; j < i + 1 ; j ++) {
//                System.out.print("*");
//            }
//            System.out.println();               // 줄바꿈을 위해서 실행문3 영역에 작성
//        }

        /*
            숫자를 입력 받아 그 줄 수 만큼의 별찍기가 이루어질 수 있도록 작성하시오.

            실행 예

            숫자를 입력하세요 >>> 3
            *
            **
            ***
         */
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);
        // 줄 수를 저장할 변수 입력
//        int row = 0;
//        System.out.print("숫자를 입력하세요 >>> ");
//        row = scanner.nextInt();
//
//        // 별찍기를 할 2중 for문 작성 시작하시면 됩니다.
//        for ( int i = 0 ; i < row ; i++) {
//            // 아까전에는 줄 수가 고정되어있었기 때문에  int값을 썼지만 여기서는 입력받은 값을 쓰기 위해서 row 변수를 i < row형태로 작성
//            for ( int j = 0 ; j < i + 1 ; j++ ) {
//                System.out.print("*");  // 실행문2의 역할 : 별이 찍히는 것 밖에 없죠
//            }
//            System.out.println();       // 실행문3의 역할 : 개행
//        }

        /*
            *****
            ****
            ***
            **
            *
         */
//        for(int i = 5 ; i > 0 ; i--) {          // 감소 패턴의 경우에는 잘 쓰지 않는 i--와 int i = 0부터가 아니라는 점
//            for (int j = 0 ; j < i ; j++) {     // j에서는 j++를 적용한다는 점 때문에 구조를 파악할 필요가 있다는 점이 중요
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
            줄 수를 입력 받아서 감소하는 패턴으로 작성할겁니다.

            숫자를 입력하세요 >>> 3
            ***
            **
            *
         */

//        int row2 = 0;
//        System.out.print("숫자를 입력하세요 >>> ");
//        row2 = scanner.nextInt();
//
//        for(int i = row2 ; i > 0 ; i--) {
//            for (int j = 0 ; j < i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
/*
            *
           **
          ***
         ****
        *****
 */
        // 공백이 먼저 나오고 후에 별이 찍히는 형태
        for(int i = 0 ; i < 5 ; i++) {
            // 공백을 위한 반복문(공백의 개수가 -1씩 이루어지구요)
            for(int j = 0 ; j < (5 - (i + 1)) ; j++){
                System.out.print(" ");     // 공백 실행문
            }
            // 별을 찍기 위한 반복문(별의 개수 +1씩 이루어집니다)
            for(int k = 0 ; k < i + 1 ; k++) {          // int j 부분과 k 부분에서 종료값부분의 합이 5로 고정돼야 함.
                System.out.print("*");     // 별찍기 실행문
            }
            System.out.println();   // 개행을 위한 실행문
        }



    }
}
