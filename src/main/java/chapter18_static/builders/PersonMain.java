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

    }
}
