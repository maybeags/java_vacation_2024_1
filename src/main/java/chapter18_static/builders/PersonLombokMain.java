package chapter18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder()
                .address("서울특별시 종로구")
                .age(14)
                .name("김일")
                .build();

        System.out.println(person1);

        PersonLombok person2 = PersonLombok.builder()
                .name("김이")
                .build();
        System.out.println(person2);
    }
}
