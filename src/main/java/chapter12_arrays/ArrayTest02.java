package chapter12_arrays;

import java.util.Scanner;

/*
    String[] names 배열을 선언하고
    출석부에 이름을 입력하여 names 배열에 집어넣는 프로그램을 작성합니다.

    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 9
    1 번 학생 이름 : 김경준
    2 번 학생 이름 : 김민지
    3 번 학생 이름 : 노소정
    4 번 학생 이름 : 박종현
    5 번 학생 이름 : 백지흔
    6 번 학생 이름 : 성재원
    7 번 학생 이름 : 오성민
    8 번 학생 이름 : 윤지희
    9 번 학생 이름 : 윤현지

    [ 출력 결과 ]
    1. 김경준
    2. 김민지
    3. 노소정
    4. 박종현
    5. 백지흔
    6. 성재원
    7. 오성민
    8. 윤지희
    9. 윤현지
 */
public class ArrayTest02 {
    public static void main(String[] args) {
//        int[] thisAges = new int[5];            // 배열 선
//
//        thisAges[0] = 38;                       // 배열 내에 특정 인덱스에 데이터를 대입하는 방식
//        thisAges[1] = 32;
//
//        for(int i = 0 ; i < thisAges.length ; i++) {
//            System.out.println(thisAges[i]);
//        }

        // 사용할 클래스와 객체
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");

        // 사용할 변수 선언
        int number = scanner.nextInt();     // 때문에 반복문에서 두번 출력됨
        scanner.nextLine();                 // enter로 넘어가는 거 막기 위한 배리어 역할
        String[] names = new String[number];

        // 입력하는 반복문
        for(int i = 0 ; i < names.length ; i++) {
            System.out.print((i+1) + "번 학생 이름 : ");
            names[i] = scanner.nextLine();
        }

        System.out.println();           // 개행하기 위한 sout
        System.out.println("\n[ 출력 결과 ]");  // 위에 sout 쓰기 싫으면 "\n"이거 쓰는 방법도 있음
        // 출력하는 반복문
        // 배열의 요소를 출력하는 반복문을 작성해야 하는데 -> 실행 예와 같은 방식으로 편집하는 과정이 필요
        for(int i = 0 ; i < names.length ; i++) {
            System.out.println((i+1) + ". " + names[i]);
        }
    // 다 작성하셨으면 ArrayTest03 클래스 만드세요


    }
}
