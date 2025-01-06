package chapter08_methods;

import java.util.Scanner;

public class ScoreCalC {
    /*
        총합을 내는 메서드
        오버로딩을 해서 매개변수 개수를 늘려 총합을 계산
     */

    // 1. 총합을 내는 메서드 : call4() 유형으로 작성 -> 매개변수 / return값이 존재
    public static double addSubjects(double totalScore, double addedScore) {
        return totalScore + addedScore;
    }

//    // addSubjects() 오버로딩하여 매개변수가 3, 4, 5, 6 개인 메서드들을 만드세요.
//    public static double addSubjects(double score1, double score2, double score3) {
//        return score1 + score2 + score3;
//    }
//
//    public static double addSubjects(double score1, double score2, double score3, double score4) {
//        return score1 + score2 + score3 + score4;
//    }
//
//    public static double addSubjects(double score1, double score2, double score3, double score4, double score5) {
//        return score1 + score2 + score3 + score4 + score5;
//    }

    // 2. 평균을 내는 메서드 : call4() 유형으로 작성
    public static double calculateAvg(double totalScore, int numberOfSubjects) {
        return totalScore / numberOfSubjects;
    }

    public static void main(String[] args) {
//        System.out.println(addSubjects(4.5, 3.5));
//        // method를 사용하지 않고 main 단계에서 직접 연산한 코드
//        double avgScore1 = addSubjects(4.5, 3.5) / 2;
//        System.out.println(avgScore1);

//        System.out.println();


        // calculateAvg를 이용하여 method로 연산한 코드
//        double totalScore2 = addSubjects(4.5, 3.5);
//        System.out.println(calculateAvg(totalScore2, 2));
        // 더 가독성을 떨어지지만 여전히 개발환경에서 자주 쓰이는 방식
//        System.out.println(calculateAvg(addSubjects(4.5, 3.5), 2));

        // 이상의 코드를 확인했을 때 알 수 있는 점은 addSubjects() method의 결과값이 calculateAvg() 메서드의
        // 첫번째 argument가 됐다는 점입니다. -> 보통 프로그래머스 / 백준 같은데서 코딩테스트를 했을 때
        // 괴수같은 사람들이 풀이한거 보면 변수 대입하지 않고 저런식으로 작성하는 것을 확인할 수 있을 겁니다.


        // main 단계에서 addSum(double totalScore, double addedScore)를 반복해버리면
        // 오버로딩할 필요가 없습니다.

        // 점수를 입력을 받을 Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);

        // 사용할 변수 목록
        boolean endOfCalc = false;
        double score1 = 0;
        double totalScore = 0;
        int totalSubjects = 1;          // 과목수
        double avgScore = 0;            // totalScore / totalSubjects의 값이 될 예정 -> 자료형 신경

        // 점수 입력을 반복하기 위한 while문을 작성
        while(!endOfCalc) {
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            // score1 = -1이 대입되었다면 반복문이 종료되어야 하므로 조건문 작성
            if(score1 == -1) {          // 왜 굳이 '종료'라든지 'x'라든지 이런게 아니라 -1을 입력했을 때 종료되게끔 코드를 작성해야 할까요?
                break;
            }
            // 합을 계산하는 코드
            totalScore = addSubjects(totalScore, score1);   // 첫 반복문 시작일 때는 addSubjects(0, score1);

            // 평균을 계산하는 코드
            avgScore = calculateAvg(totalScore, totalSubjects);
            System.out.println("-------- 점수 입력시마다 나오는 합계와 평균입니다. --------");
            System.out.println("입력한 점수의 합계 : " + totalScore);
            System.out.println("입력한 점수의 평균 : " + avgScore);

            // 평균 계산이 끝난 후 그 다음 반복에서는 totalSubjects에 +1 이루어져야합니다.
            totalSubjects++;
        }

    }
}
