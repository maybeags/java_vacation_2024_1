package chapter06_condition;

import java.util.Scanner;

/*
    3. if - else if문 : if - else문과 달리 else if에는 별도의 조건문이 요구

    형식 :
    if(조건문1) {
        실행문1
    } else if(조건문2) {
        실행문2
    }
 */
public class Condition02 {
    public static void main(String[] args) {
        // 1. Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);

        // 2. 변수(상수) 선언 및 초기화
        int point = 0;
        String rating = "";
        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        // main 단계에서 실제로 실행되는 코드 작성
        System.out.print("회원 포인트를 입력하세요 >>> ");
        // 변수에 데이터 재대입
        point = scanner.nextInt();

        // 수업 내용과 관계있는 조건문 작성

        if(point > 80) {
            System.out.println("회원의 등급 : VIP");
//            rating = "VIP";
        } else if(point > 60) {                         // else if문의 경우에는 여러 개가 올 수 있습니다.
            System.out.println("회원의 등급 : GOLD");     // 지시사항 - silver 등급과 bronze 등급에 해당하는 else if문을 완성하세요.
//            rating = "GOLD";
        } else if(point > 40) {                         // else if문의 경우에는 여러 개가 올 수 있습니다.
            System.out.println("회원의 등급 : SILVER");
//            rating = "SILVER";
        } else if(point > 20) {
            System.out.println("회원의 등급 : BRONZE");
//            rating = "BRONZE";
        } //else if(point <= 20) {                        // 방법 1
//            System.out.println("회원의 등급 : 일반");
//        }
        else if (point >= 0){                                            // 방법 2
            System.out.println("회원의 등급 : 일반");
//            rating = "일반";
        }

//        System.out.println("회원의 등급 : " + rating);
        /*
            이전까지의 방식
            System.out.print("회원 포인트를 입력하세요 >>> ");
            int point = scanner.nextInt();

            그렇다면 왜 이번에는 저런 방식으로 작성했는가

            다른 사람들과의 협업을 염두에 두고 사용되는 클래스 및 변수들을 초반부에 전부 선언한 뒤
            실제로 사용할 때 재대입을 하는 방식으로 작성하는 것이 가독성을 염두해둔 코드라고 할 수 있겠습니다.


            1. 조건문 내에 println을 매번 작성하는 방법 vs. 2. 변수를 선언한 뒤에 맨 마지막에 한 번만 println을 작성하는 방법

                1.의 경우에는 조건을 벗어나는 숫자가(예를 들어) 나왔을 경우 어떤 실행문도 나오지 않을 수 있지만
                2.의 경우에는 조건문 바깥에다 println을 작성했기 때문에 실행문이 언제나 실행됨.

         */
    }
}
