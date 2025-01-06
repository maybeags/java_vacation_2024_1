package chapter09_classes;

import java.util.Scanner;

/*
    chapter10_classes package -> ScoreCalC.java / ScoreCalCMain.java 생성
 */
public class ScoreCalCMain {
    public static void main(String[] args) {

        // Scanner import 하는 방법
        Scanner scanner = new Scanner(System.in);
        // 마찬가지로 우리가 직접 정의한 외부의 메서드들을 사용하기 위해서는 클래스를 import할 필요가 있습니다.
        ScoreCalC01 scoreCalC = new ScoreCalC01();      // 객체 생성 과정

        //객체명.메서드명()의 형태로 외부에 있는 클래스의 메서드를 사용할 수 있습니다.
        double totalScore = scoreCalC.addScores(100, 100);
        System.out.println("두 과목 점수의 합 : " + totalScore);

        System.out.println("과목 평균 : " + scoreCalC.calculateAvg(totalScore, 2)); // 변수 대입없이 바로 메서드 적용
                                                                                     // 결과가 출력되록 println 코드를 작성했습니다.





    }
}
