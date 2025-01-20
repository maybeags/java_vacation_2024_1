package chapter16_objects;
/*
    모든 클래스는 Object 클래스를 상속 받는다.
        -> 우리가 정의한 것 말고 기존에 있는 class들을 말합니다.

    toString(), equals(), hashCode()

    1. toString() : 객체의 문자열 표현
        기본적으로 모든 클래스는 Object 클래스를 상속 받으며, Object의 toString() 메서드는
        클래스 이름과 해시코드(주소지라는 표현으로 써옴)를 반환함.
        -> 이를 Override해서 재정의해서 필드를 표현하는 등 다양한 방식으로 변환시켜서 사용하는 편

        왜 사용 하는가? : 사람들이 읽기 편한 방식으로 재정의하구요, 객체명만으로도 불러낼 수 있음.
            즉, 객체명.toString()으로 쓰지 않고, 객체명 만으로 호출 가능

    2. equals() : 객체의 동등성 표현
        두 객체가 '논리적으로 같은지'를 비교하는 메서드
        기본적으로 Object 클래스의 equals() 메서드는 두 객체의 참조 주소를 비교합니다.
        형식 :
            객체명1.equals(객체명2)   -> 객체명1과 객체명2의 참조 주소가 동일한지 확인 : 3형식문장

    3. hashCode() : 객체의 고유 값
        객체를 정수 값(해시값)으로 반환
        해시 값은 주로 해시 기반 컬렉션에서 사용됩니다(내일 쯤부터 수업 예정)
        equals()를 override하면 hashCode()도 '반드시 Override해야합니다.'
            - 동일한 객체(equals() == true)는 동일한 해시 코드를 가져야만 하기 때문인데,
            - 문제는 해시 코드가 같다고 해서 항상 equals()가 true가 아니라는 점이 있습니다.
 */
public class ObjectTest extends Object{
    private String name;
    private String address;

    // 기본 생성자 생성하세요.
    public ObjectTest() {}

    // 매개변수 생성자(AllArgsConstructor)를 생성하세요.
    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }
    // setter / getter 정의하세요.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // displayInfo1()를 정의하세요 -> call1()으로.
    // 실행 예
    // 이름 : 안근수
    // 주소 : 부산광역시 연제구
    public void displayInfo1() {
        System.out.println("이름 : " + this.getName());
        System.out.println("주소 : " + this.getAddress());
    }

    // displayInfo2()를 정의하세요 -> call3()으로
    public String displayInfo2() {
        return "이름 : " + this.name + "\n주소 : " + this.address;
    }

    // 즉, 기본적으로 toString()이라는 메서드는 어떤 특정한 클래스의 인스턴스를 전부 다
    // String 형태로 바꿔주는 것을 의미하고, Object 클래스의 메서드를 Override했음을 확인할 수 있음.
    @Override
    public String toString() {
        return "이름 : " + this.name + "\n주소 : " + this.address;
    }


//    @Override
//    public String toString() {
//        return "ObjectTest{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
