package chapter09_classes;

public class ConstructorMain {
    public static void main(String[] args) {

        // Constructor 클래스의 인스턴스 생성
        Constructor constructor0 = new Constructor();

        // 객체인 constructor0의 필드에 값 대입
        constructor0.num = 38;
        constructor0.name = "안근수";

        System.out.println(constructor0.num);
        System.out.println(constructor0.name);

        // 매개변수 생성자를 활용한 객체 생성 - int
        Constructor constructor1 = new Constructor(20);

        System.out.println(constructor1.num);

        // 매개변수 생성자를 활용한 객체 생성 - String
        Constructor constructor2 = new Constructor("안근순");

        System.out.println(constructor2.name);

        // AllArgsConstructor를 활용한 객체 생성
        Constructor constructor3 = new Constructor(10,"김철수");
        System.out.println(constructor3.num);
        System.out.println(constructor3.name);


        constructor2.showInfo();
        System.out.println();
        System.out.println(constructor2.showInfo2());
    }
}
