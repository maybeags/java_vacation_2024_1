package chapter17_bean.persons;

public class PersonLombok {
    private final String name;
    private int age;

    // Lombok 애너테이션을 적용하여 생성자 / getter / setter를 만들어줍니다.
    // PersonMain으로 가서
    // Person 클래스의 객체 person1을 생성하시고 -> 이름 - 안근수 / 나이 - 38
    // PersonLombok 클래스의 객체 person2를 생성하시고 -> 이름 - 여러분 이름 / 나이 - 여러분 나이
    // toString() 메서드를 정의해서
    // 실행 예
    // 이름 : 안근수
    // 나이 : 38
    // 로 콘솔에 출력될 수 있도록 작성하시오.
}
