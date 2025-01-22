package chapter18_static.builders;
/*
    1. 빌더 패턴(Builder Pattern)이란?
        빌더 패턴은 객체의 생성 과정에서 '복잡한 생성자'를 대신하여 객체를 단계적으로
        생성할 수 있도록 도와주는 디자인 패턴. GOF(Gang of Four) 디자인 패턴 중
        하나로, 객체 생성시 가독성과 유연성을 제공하는 것이 목표.

        주요 특징 :
            1) 객체를 생성하는 여러 개의 필드를 명시적으로 관리할 수 있음.
            2) 불필요한 생성자 오버로딩을 줄여 가독성을 높임(기본생성자/필드1만 포함하는 생성자/
            /필드2만 포함하는 생성자/필드3만 포함하는 생성자/전부다포함하는 생성자)
            3) 체이닝 메서드를 사용하여 객체를 직관적으로 생성

    2. 빌더 패턴이 생기게 된 원인
        1) 복잡한 생성자 문제
            객체의 필드가 많아질 수록 생성자의 파라미터 수도 늘어남.
        2) 생성자 오버로딩 문제 - 생성자에 필요한 조합이 다를 경우 수많은 생성자를 만들어야 함.
            -> 유지 보수에 악영향 / 필드 하나 추가하면 생성자들 싸그리 다 고쳐야 한다는 문제
        3) 가독성과 유지보수
            코드를 작성하고 읽는 입장에서 객체를 생성할 때 어떤 값이 어떤 필드에 해당하는지
            명확하지 않아 실수를 유발할 수 있음.

        -> 이상을 이유로 빌더 패턴의 개념이 생겨났습니다.
 */
public class Person {
    // 빌더 패턴에 대한 예시입니다. 전체 구조를 중점적으로 확인하세요.
    // 필드 선언
    private String name;
    private int age;
    private String address;

    // 이렇게 번거로워서 빌더패턴이 생겨났습니다 -> 를 보여주는 예시
//    public Person() {
//    }
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person(int age) {
//        this.age = age;
//    }
//    // public Person(String address)를 생성하려고 할 때부터 문제 발생 -> name도 String이라서 구분 불가
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }
//
//    public Person(int age, String address) {    // 그러면 String, int도 두개니까 상관없을 거 같은데
//        this.age = age;                         // 순서로 구분하니까 얘는 또 됩니다.
//        this.address = address;
//    }
//
//    public Person(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }

    // 여기서부터 빌더 패턴 시작합니다.
    // 차이점 바로 있음
    private Person(Builder builder) {       // 접근 지정자가 private이기 때문에 PersonMain에서 생성 불가능
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    // 이상의 코드를 기준으로 봤을 때 Builder 클래스의 객체인 builder의 인스턴스 변수
    // name / age / address를 Person 객체의 인스턴스 변수 name / age / address에 대입

    // Person 생성자의 매개변수인 Builder 클래스를 정의
    public static class Builder {
        // Builder 클래스 내부에 필드 선언
        private String name;        //-> Person과 필드가 동일
        private int age;
        private String address;

        // Builder 클래스의 생성자를 정의 -> 필드 하나당 하나씩 만들어야 합니다.
        // 여기서 중요한 점이 method명인데 동사가 아니라 인스턴스 변수명으로 작성을 해야 할 필요가 있습니다 -> 약속에 해당

        //그러면 일반적인 생성자라기 보다는 Builder 자료형의 name이라는 메서드가 되고, 매개변수로 String name을 갖게 됩니다.
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 최종 객체 생성 메서드 -> ↑ 현재 빨간줄 떠있는거 정상
        public Person build() {
            return new Person(this);        // Person 생성자가 여기서 사용 가능한 이유? -> 같은 클래스라서
        }




    }
}
