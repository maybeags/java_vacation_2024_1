package chapter09_classes;
/*
    ClassA에 적은 내용을 바탕으로 Car 클래스를 정의할 예정
 */
public class Car {
    // 필드(속성)
    String color;
    int speed;

    // 메서드(행동)
    void drive() {
        System.out.println(color + "자동차가 주행 중입니다.");
    }

    void stop() {
        System.out.println(color + "자동차가 멈췄습니다.");
    }

    /*
        1. CarMain.java 클래스를 생성하세요.
        2. Car의 인스턴스인 myCar라는 객체를 생성하세요.
        3. color에 "빨강"을 대입하세요. -> 출력하세요
        4. your car라는 객체를 생성하세요.
        5. color에 "노랑"을 대입하세요. -> 출력하세요
        6. myCar는 drive() 메서드 호출, yourCar는 stop() 메서드를 호출하세요.
     */
}
