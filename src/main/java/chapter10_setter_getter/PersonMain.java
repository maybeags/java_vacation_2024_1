package chapter10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        // Person 객체를 생성 -> 문제상황들 예시입니다.
        Person person01 = new Person();     // 기본 생성자를 통해 객체 생성
        Person person02 = new Person("사실 사람이 아니다");
        Person person03 = new Person(1000);
        Person person04 = new Person("사실은 동물이다", -100);

        // 필드에 값 대입                 -> private 대입 후에 오류나기 때문에 주석처리합니다.
//        person01.name = "안근수";
//        person01.age = -10;

//        person02.age = 200;
//        person03.name = "김나카무라";        // 즉 필드명을 알고, 자료형만 일치한다면 성립할 수 없는 데이터를
                                            // 필드에 대입할 수 있다는 문제점이 있습니다.

        // 이를 막기 위한 방법으로 추후에 배울 접근지정자(Access Modifier) 개념이 존재합니다.
        // Person.java로 돌아가서 필드의 자료형 앞에 private을 명시해보시기 바랍니다.

        // getter 사용    -> return형태로 마무리했기 때문에 콘솔에 출력 위해서는 sout 필요
        System.out.println(person02.getName());
        // setter 사용
        person02.setName("안근수");
//        System.out.println(person02.getName());
//        person02.setName("짐승이다");
//        System.out.println(person02.getName());

        person03.setAge(20);
        System.out.println(person03.getAge());
        person04.setName("박이");
        person04.setAge(40);
        System.out.println(person04.getName());
        System.out.println(person04.getAge());

        person03.setProfile("박삼", 9);
        System.out.println(person03.getName());
        System.out.println(person03.getAge());

        person02.setAge(-10);

    }
}
