package chapter17_bean.persons;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("안근수");     // 이렇게 생성하시거나,
        Person person3 = new Person("안근수", 38); //로 AllArgsConstructor를 사용하는 방법이 있겠습니다.

        // 1의 경우에는 setAge를 따로 적용 해줘야 함.
        person1.setAge(38);

        System.out.println("이름 : " + person1.getName());
        System.out.println("나이 : " + person1.getAge());     //가 여태까지 저희가 작성하던 방식

        System.out.println();
        System.out.println(person1);    // toString()을 오버라이드해서 재정의하는 법을 배운 우리가 쓸 방식

        PersonLombok person2 = new PersonLombok("여러분이름");   // @RequiredArgsConstructor를 활용한 생성
        PersonLombok person4 = new PersonLombok("여러분이름", 20);   // @AllArgsConstructor를 활용한 생성

        person2.setAge(20);
        System.out.println();
        System.out.println("이름 : " + person2.getName());
        System.out.println("나이 : " + person2.getAge());     //가 여태까지 저희가 작성하던 방식

        System.out.println();
        System.out.println(person4);

        PersonLombok2 person5 = new PersonLombok2("김일", 21);
        System.out.println();
        System.out.println(person5);
    }
}
