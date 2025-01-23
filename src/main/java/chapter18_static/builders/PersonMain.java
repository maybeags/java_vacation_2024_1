package chapter18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        //Person 객체 생성 -> 일반적인 방법으로는 불가능 -> 생성자를 private
        Person person1 = new Person.Builder()          // Builder는 static 선언했기 때문에
                .address("부산광역시 연제구")           // Person이라는 클래스명으로 호출 가능
                .build();       // . build();로 마무리 지었을 때 객체 생성이 완료됨.


        Person person2 = new Person.Builder()
                .age(38)
                .name("안근수")
                .address("부산시 연제구")
                .build();

        // 기존의 생성자 방식   -> 필드의 순서를 명확히 알고 있어야 객체를 생성할 수 있다는 단점이 있음.
        // -> 이를 보완하고 가독성 있는 객체 생성을 위해 채용된 것이 빌더 패턴이다.
//        Person person2 = new Person("안근수", 37, "부산광역시 연제구");

    }
}
