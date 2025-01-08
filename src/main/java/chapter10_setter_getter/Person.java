package chapter10_setter_getter;

public class Person {
    // 필드 선언
    private String name;
    private int age;

    // 매개변수 생성자를 하나라도 정의하게 되면 default로 만들어지는 기본 생성자는 허용되지 않음.
    // 이상을 이유로 매개변수 생성자를 하나라도 만들게 됐을 때, 기본 생성자 역시 따로 정의해줘야만 합니다.

    // 기본 생성자
    public Person() {
    }

    // 매개변수 생성자
    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter 구조        set + 필드명으로 이루어지는 편입니다.
    // call2()유형으로 만들어집니다 -> void / 매개변수가 존재
    // 값을 변경하거나 대입할 argument가 필요하기 때문
    public void setName(String  name) {
        // setName의 경우 메서드이기 때문에 내부에 로직을 설계 가능한데,
        // String name의 길이가 4 글자 초과라면 메서드를 강제 정지시킴으로써 입력을 불가능하게 막을 수 있음
        System.out.println("이름을 수정합니다.");
        System.out.println("변경 전 : " + this.name);
        this.name = name;
        System.out.println("변경 후 : " + this.name);
    }
    // Getter 구조        get + 필드명으로 이루어지는 편입니다.
    // call3()유형으로 만들어집니다 -> return 값 있고 / 매개변수 없음
    // 데이터의 조회만 하면 되기 때문에 매개변수가 요구되지 않음. 즉 () 안에 아무것도 없다
    // 필드와 동일한 자료형의 return값이 요구되기 때문에 -> void가 아니다.
    public String getName() {
        return name;
    }

    // setAge와 getAge를 정의하시오.
    // person03의 age를 20으로 변경하고,
    // person04의 name을 여러분 이름, 여러분 나이로 변경한 후에 바뀐 필드들만 콘솔에 출력하세요.

    // setAge
    public void setAge(int age) {
        // method이기 때문에 {} 내부에 로직을 작성할 수 있음.
        // -> 이를 통해 데이터 유효성 검증을 위한 부분을 추가할 수 있음.
        // 조건문을 적용해서 0 이상의 값만 입력이 가능하게끔 코드를 작성하면 됩니다.
        // 시작하세요
        // 150 초과를 입력할 수 없게끔 로직을 수정하세요.
//        if (age > -1 && age < 151) {
//            this.age = age;
//        } else {
//            System.out.println("불가능한 나이 입력입니다.");
//        }
        if (age > -1) {
            if (age < 151) {
                this.age = age;
            }
        } else {
            System.out.println("불가능한 나이 입력입니다.");
        }
    }

    // getAge
    public int getAge() {
        return age;
    }

    // setProfile   -> AllArgsConstructor와의 차이
    // 생성자는 만들 때 값을 입력하는 거고
    // setProfile의 경우에는 만들어진 객체의
    // 필드 값을 한꺼번에 바꾸는 겁니다.
    public void setProfile(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
