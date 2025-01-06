package chapter09_classes;

public class CarMain {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();
        // color에 "빨강" -> 출력
        myCar.color = "빨강";
        System.out.println(myCar.color);
        // 객체 생성2
        Car yourCar = new Car();
        yourCar.color = "노랑";
        System.out.println(yourCar.color);

        // 메서드 들 실행
        myCar.drive();
        yourCar.drive();
        myCar.stop();
        yourCar.stop();
    }
}
