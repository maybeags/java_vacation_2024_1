package chapter09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        // ClassA를 import
        ClassA classA = new ClassA();
    //  클래스명 객체명 = new 클래스명();  -> = 뒷부분은 추후 수업 예정

        // 결과적으로 여러분들은 Scanner라는 것을 import할 때마다 사실 객체 생성을 해오고 있었습니다.
        // 따즈아에서 주로 사용하는 Scanner의 객체명은 sc였습니다.
        Scanner sc = new Scanner(System.in);

        // 제가 자주 사용하는 방식은 클래스명을 그대로 도입했었습니다 -> 오해를 피하고자
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요 >>> ");
        // name 필드에 값 대입
        classA.name = sc.nextLine();
        System.out.print("점수를 입력하세요 >>> ");
        // score 필드에 값 대입
        classA.score = sc.nextInt();

        System.out.println(classA.name);
        System.out.println(classA.score);

        // 메서드 호출
        classA.callName();

        // ClassA의 객체 classB를 생성하고,
        ClassA classB = new ClassA();
        // name에 여러분 이름 입력
        System.out.print("classB의 이름을 입력하세요 >>> ");
        classB.name = scanner.nextLine();
        // score에 4.5를 입력하는데, scanner 객체를 사용하세요.
        System.out.print("classB의 점수를 입력하세요 >>> ");
        classB.score = scanner.nextDouble();
        // 그리고 sout을 통해 여러분 이름과 점수를 콘솔에 출력하고,
        System.out.println(classB.name);
        System.out.println(classB.score);
        // callName() 메서드를 호출하세요.
        classB.callName();


    }
}
