package chapter06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        /*
    사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.

    score가 0보다 작거나 100보다 크면 grade는 x
    Changedscore -> 9 ~ 10, grade = A
    Changedscore -> 8, grade = B
    Changedscore -> 7, grade = C
    Changedscore -> 6, grade = D
    Changedscore -> 5 미만, grade = F

    실행 예
    점수를 입력하세요 >>> 100
    학점은 A 학점입니다.

    if 문을 통해서 0 미만과 100 초과를 걸러내서 "x"
    나머지 부분을 switch 문을 통해서 작성

         */

        Scanner scanner = new Scanner(System.in);

        int score = 0;
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        int changedScore = score / 10;
        String grade = "";

        // 5, 4, 3, 2, 1 -> F학점
        // 100점 초과 0점 미만 -> if 문으로 걸러내서 x
        // 5, 4, 3, 2, 1 -> switch문의 default -> F

        if(score < 0 || score > 100) {
            grade = "x";
        } else {            // score >= 0 && score <= 100인 조건일 때 실행됨
            switch (score/10) {
                case 10:
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                case 7:
                    grade = "C";
                case 6:
                    grade = "D";
                default:
                    grade = "F";
            }
        }
        System.out.println("학점은 " + grade + "등급입니다.");



    }
}
