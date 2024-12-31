package chapter06_condition;

import java.util.Scanner;

/*
    4. 중첩 if문(Nested if sentence)
    if문 내에 if문이 연속적으로 들어올 수 있습니다.

    형식 :
    if(조건문1) {
        if(조건문1-a) {
            실행문1
        }
    } else if(조건문2) {
        if(조건문2-a) {
            실행문2-a
        } else {
            실행문2-b
        }
    } else {
        실행문3
    }

    사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.

    score가 0보다 작거나 100보다 크면 grade는 x
    score -> 90 ~ 100, grade = A
    score -> 80 ~ 89, grade = B
    score -> 70 ~ 79, grade = C
    score -> 60 ~ 69, grade = D
    score -> 0 ~ 59, grade = F

    실행 예
    점수를 입력하세요 >>> 100
    입력한 점수는 100 점이며, 학점은 A 학점입니다.

 */
public class Condition03 {
    public static void main(String[] args) {
        // 클래스 import
        Scanner scanner = new Scanner(System.in);

        // 사용할 변수 선언
        int score = 0;
        String grade = "";

        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        if (score > 100 || score < 0) {
            grade = "x";
        } else if(score > 89) {
            grade = "A";
        } else if(score > 79) {
            grade = "B";
        } else if(score > 69) {
            grade = "C";
        } else if(score > 59) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("입력한 점수는 " + score + "이며 학점은 " + grade + "학점 입니다.");
    }
}
/*
    혹시나 결석하실 때 github로 코드만 확인하시고 싶다면
    https://github.com/maybeags

    id : maybeags
 */