package chapter17_bean.persons;

public class Person {
    // 필드 선언
    // 접근 지정자와 자료형 사이에 final을 명시하게 됐을 경우
    // 1. 초기화를 하면서(첫 대입을 하면서), 그 값만 계속해서 써야만 함.
    // 2. 생성자를 통해 객체를 생성하면서 해당 필드는 무조건 포함되어야 함 -> 기본 생성자 사용 불가능
    private final String name ;
    private int age;

    // 필수적인 필드를 포함한 RequiredArgsConstructor를 생성
    public Person(String name) {
        this.name = name;
    }

    // 그 다음에 필수 필드 + 옵션 필드를 포함한 생성자 -> AllArgsConstructor라고 볼 수 있습니다.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter / Getter를 롬복 쓰지 말고 생성하시오.
    // 다 하신 분들은 PersonLombok으로 가셔서
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString()을 정의해야 합니다. alt + insert

    @Override
    public String toString() {
        return
                "이름 : " + name + '\n' +
                "나이 : " + age;
    }
}
