package chapter14_abstraction.abstract_class;
/*
    abstract : 추상적인

    추상 클래스
    1. 추상 메서드가 하나라도 포함되면 해당 클래스는 추상 클래스로 정의돼야 함.
    2. 추상 클래스는 생성할 수 없다.        -> 객체 생성이 불가능함을 의미
    3. 그 외의 다른 특징은 일반 클래스와 동일함
    4. 상속을 전제로 하는 클래스

    추상 클래스 : 추상 메서드가 하나 이상인 클래스
    추상 메서드 : 선언만 있고, 구현은 없는 메서드

    추상 클래스의 장점 :
        코드의 재사용성을 높이고 설계를 보다 명확하게 할 수 있도록 도와준다.

    추상 클래스의 목적 :
        1. 공통된 기능 제공 : 여러 클래스에서 공통적으로 사용하는 기능을 추상 클래스에서 정의 가능
        2. 구체적인 구현 강제 : 추상 메서드를 통해 자식(서브) 클래스가 반드시 특정 메서드를
            구현하도록 강제할 수 있다.
        3. 코드의 재사용성 : 중복되는 코드를 줄이고, 유지 보수성을 높일 수 있다.

    추상 클래스에서 주의할 점 :
        - 추상 클래스는 객체를 생성할 수 없다.

    super 키워드 - 슈퍼 클래스의 멤버 및 메서드에 접근하기 위해서 사용
        1. 서브 클래스에서 슈퍼 클래스로 생성자를 호출할 때 사용 -> super(매개변수)
        2. 서브 클래스에서 슈퍼 클래스로 메서드를 호출할 때 사용 -> super.메서드명()

    생성할 클래스 목록
        Factory.java            -> 얘가 디자인 패턴이라는 의미가 아닙니다.
        PhoneFactory.java       -> Factory 상속
        TabletFactory.java      -> Factory 상속
 */
public class Main {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성 불가능
//        Factory factory1 = new Factory("임시 공장") {
//            @Override
//            public void produce(String model) {
//                System.out.println("임시 공장에서 [ " + model + " ]을 생산합니다.");
//            }
//
//            @Override
//            public void manage() {
//                System.out.println("임시 공장에서 야근중입니다.");
//            }
//        };
//
//        System.out.println(factory1.getName());
//        factory1.manage();
//        factory1.printInfo();
//        factory1.produce("고무장갑"); -> 익명 클래스 관련으로 추후 수업 예정

        // 근데 이상의 개념은 Java 17 이후(혹시 11일수도 있습니다...)에 적용된 익명 클래스 개념으로 되게
        // 임시방편적 성격이 강합니다.

        PhoneFactory phoneFactory1 = new PhoneFactory("애플 스마트폰 공장");
        TabletFactory tabletFactory1 = new TabletFactory("애플 태블릿 공장");

        phoneFactory1.produce("아이폰17");                     // Factory.java에 있던 추상 메서드를
        tabletFactory1.produce("아이패드 프로 13인치 8세대");     // Override해서 재정의한 메서드

        phoneFactory1.printInfo();                                  // 슈퍼 클래스의 일반 메서드를
        tabletFactory1.printInfo();                                 // 서브 클래스의 객체가 호출함.
    }
}
