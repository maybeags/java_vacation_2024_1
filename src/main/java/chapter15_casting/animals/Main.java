package chapter15_casting.animals;
/*
    참조 자료형 캐스팅(Reference Type Casting)
        객체 지향 프로그래밍(OOP)에서 중요한 요소 중 하나로

        1. 정의 :
            Java에서의 자료형은 크게 두 가지로 구분되는데,
            1) 기본 자료형(Primitive Type) : int, double, char 등
            2) 참조 자료형(Reference Type) : 객체를 참조하는 변수로 클래스나 인터페이스로 생성된 객체

            참조 자료형 캐스팅은? -> 객체의 자료형은 변환하는 작업
            A a = new A();
            A a = new B();
                캐스팅 종류
                    1) 업캐스팅 : 하위 클래스의 객체를 상위 클래스 타입으로 변환
                    2) 다운캐스팅 : 상위 클래스 타입의 객체를 하위 클래스 타입으로 변환

                알아야 할 사항 : 연산자(Operator) instanceof -> 연산자 개념은 첫주 때 했는데
                    ex) 1 + 1 = 2에서 +가 연산자에 해당합니다.

        2. 업캐스팅 - 암시적(implicit)으로 이루어짐 -> 알아서 바뀌기는 함
            -> 다만 언제 알아서 바뀌었는지는 개발자가 파악할 필요가 있습니다.
        3. 다운캐스팅 - 명시적(explicit)으로 이루어짐 -> 반드시 개발자가
            적절한 장소와 시간대에 적용해줘야지만 합니다.

        4. 업캐스팅과 다운캐스팅의 활용
            캐스팅은 주로 다형성(Polymorphism)을 구현할 때 사용함. 상위 클래스 타입으로 객체를
            처리하면서도 특정 상황에서는 하위 클래스의 고유 기능을 사용할 수 있음.

        5. 캐스팅의 장단점
            장점 :
                코드 유연성 : 업캐스팅을 통해 '다양한 객체를 하나의 상위 클래스 타입으로 관리' 가능
                다형성 구현 : 메서드 오버라이딩과 함께 사용하면 코드의 재사용성을 높일 수 있음.

            단점 :
                다운 캐스팅의 위험성 : 잘못 다운 캐스팅을 하게 될 수 있습니다.
                    예를 들어, 상위 클래스 A와 하위 클래스 B, C가 있다고 가정했을 때,
                    B의 객체인 b를 A로 업캐스팅한 후, C로 다운캐스팅하는 문제가 생길 수 있어
                    주의가 필요함.

                복잡성 증가 : 코드 가독성이 떨어질 수 있음 -> 이렇게 바꿨다가 저렇게 바꿨다가 하기
                    때문인데 특히 업캐스팅의 경우 암시적으로 일어나기 때문에 어디서 바뀌었는지
                    확인 못하고 있다가 갑자기 다운캐스팅 튀어나와서 초심자들이 코드 읽는게 어려울 때가
                    있습니다.

        instanceof 연산자 : Java에서 객체의 실제 타입을 검사하는 데 사용
            (어떤 클래스의 객체인지를 확인하는 용도)
            -> 주로 다운캐스팅의 안정성을 확보하기 위해서 사용함.

            형식 :
                object(객체명) instanceof ClassName(클래스명) -> 1 + 2라고 생각하라고 어제 수업함

                object : 검사하려는 객체명
                ClassName : 객체가 검사될 클래스 / 인터페이스

                return값은 object가 ClassName의 인스턴스이거나 하위 클래스의 인스턴인 경우 true,
                아니면 false
 */
public class Main {
    public static void main(String[] args) {
        //Dog 객체 생성
        Dog dog1 = new Dog();

        // 메서드들 활용
        // 오버라이딩한 애
        dog1.makeSound();       // 저희가 재정의 한 애만 튀어나올겁니다.
        // 고유 메서드도 호출
        dog1.fetch();

        // Animal 객체 생성 -> 원래 Dog 클래스의 인스턴스인 dog1을 대입
        Animal animal1 = dog1;  // 업캐스팅 # 1 방법
        animal1.makeSound();    // 클래스 Dog의 makeSound() 메서드가 호출됨.
//        animal1.fetch();        // 오류 발생 -> 타입이 Animal 로 선언되어있기 때문에
                                //  Animal 클래스에 없는 fetch() 메서드를 호출하는 것이 불가능

        System.out.println("--------animal2 부분 시작할게요--------");
        Animal animal2 = new Dog(); // 업캐스팅 # 2 방법 : 얘가 정처기 등 자격증 시험에서 자주 나옵니다.
        animal2.makeSound();    // 마찬가지로 재정의된 makeSound()가 호출됨.
//        animal2.fetch()       // 마찬가지로 호출이 불가능함.

        Animal animal3 = new Animal();
        boolean result1 = (animal1 instanceof Animal);  // -> 연산이니까 ()로 묶은 사례

        System.out.println(result1);    // true

        boolean result2 = animal1 instanceof Dog;       // 그런데 매번 (1+1)로 안쓰는 것처럼 소괄호 꼭 써야하는건 아닙니다.
        System.out.println(result2); // true:object가 ClassName의 인스턴스이거나 '하위 클래스의 인스턴스인 경우' true, 아니면 false

        System.out.println("animal2 검증 부분입니다.");
        boolean result3 = animal2 instanceof Animal;
        boolean result4 = animal2 instanceof Dog;
        System.out.println(result3);    // true
        System.out.println(result4);    // true

        System.out.println("animal3 검증 부분입니다.");
        boolean result5 = animal3 instanceof Animal;
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result5);    // true
        System.out.println(result6);    // false -> Animal animal3 = new Animal()로 만들었기 때문에 업캐스팅이 아예 일어난 적 x

        System.out.println("↑ 업캐스팅 관련 파트");
        System.out.println("↓ 다운캐스팅 관련 파트");

        Dog dog2 = (Dog) animal2;
        // 다운캐스팅의 경우 명시적으로 쓰여야 하기 때문에 이전에 배운 형변환 방식인
        //'(클래스명)'을 사용해야 합니다.
        // 이전까지는 double pi = 3.14;
        // int three = (int) pi;와 같은 방식으로만 작성했지만
        // 이제는 클래스와 객체 단위로 생각할 필요가 있습니다.
        dog2.makeSound();        // 재정의된 Dog의 makeSound() 호출됨
        dog2.fetch();            // 이제 대놓고 Dog의 인스턴스이기 때문에
                                 // 고유 메서드인 fetch()가 호출 가능.

//        Dog dog3 = (Dog) animal3;
//        dog3.makeSound();
/*  이상의 코드를 실행하려고 하면 오류 발생
Execution failed for task ':chapter15_casting.animals.Main.main()'.

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
> Get more help at https://help.gradle.org.
BUILD FAILED in 506ms
2 actionable tasks: 2 executed

그 이유는 :
    애초에 animal3를 생성할 때 Animal 클래스로 만든 것을 아무런 변형을 하지 않고
    강제로 다운캐스팅을 시도하려고 했기 때문입니다.

    이상과 같은 컴파일링 오류를 막기 위한 방식으로는 animal2를 생성했을 때처럼
*/
        Animal animal4 = new Dog();
        // 형태로 animal2를 만들었을 때 처럼 선언된 클래스와 호출되는 생성자가
        // 서로 달라야만 할겁니다.

        // 컴파일링 오류를 막기 위한 다운 캐스팅 방법
        System.out.println("animal4 검증 부분입니다.");
        if (animal4 instanceof Dog) {
            Dog dog4 = (Dog) animal4;  // 위의 조건문이 true일때만 다운캐스팅 시도

            dog4.makeSound();
            dog4.fetch();
        }
    }
}
