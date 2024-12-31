package chapter06_condition;

import java.util.Scanner;

public class Condition04 {
    public static void main(String[] args) {
        /*
            switch문

            형식 :
            switch(변수)
                case 조건1:
                    실행문1
                    break;
                case 조건2:
                    실행문2
                    break;
                case 조건3:
                    실행문3
                    break;
                default:
                    실행문4
         */
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);

        // String 타입의 변수명 selected 선언하고 null로 초기화
        String selected = null;
        int selected2 = 0;

        System.out.print("메뉴를 선택하세요 >>> ");
//        selected = scanner.nextLine();
        selected2 = scanner.nextInt();

        System.out.println("[  선택 프로그램  ]");
        System.out.println("a. 메뉴1");               // ctrl + d하면 드래그 안하고 전체 복사됩니다 시도해보세요
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");

//        if (selected.equals("a")) {
//            System.out.println("메뉴 1을 선택하셨습니다.");
//        } else if (selected == "b") {
//            System.out.println("메뉴 2를 선택하셨습니다.");
//        }

//        switch (selected) {
//            case "a":
//                System.out.println("메뉴1을 선택하셨습니다.");
//                break;
//            case "b":
//                System.out.println("메뉴2을 선택하셨습니다.");
//                break;
//            case "c":
//                System.out.println("메뉴3을 선택하셨습니다.");
//                break;
//            case "d":
//                System.out.println("메뉴4을 선택하셨습니다.");
//                break;
//            case "e":
//                System.out.println("메뉴5을 선택하셨습니다.");
//                break;
//            default:
//                System.out.println("잘못 선택하셨습니다.");
//        }


        switch (selected2) {
            case 1:
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("메뉴2을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case 4:
                System.out.println("메뉴4을 선택하셨습니다.");
                break;
            case 5:
                System.out.println("메뉴5을 선택하셨습니다.");
//                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
        }








    }
}
