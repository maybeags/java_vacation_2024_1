package chapter09_classes;
/*
    생성자(Constructor)
    생성자는 객체가 생성될 때 호출되는 '특별한' 메서드

    ClassExample example = new ClassExample(); -> ClassExample 클래스의 객체 생성 -> 객체 이름 : example
    까지는 여태까지 수업한 내용인데,
    사실
    new ClassExample();이 생성자에 해당합니다.

    특징
        1. 클래스의 이름과 생성자 이름은 동일하다(즉, 다른 메서드들과 달리 대문자로 시작한다)
        2. return 값이 없다 -> call1(), call2() 유형으로 받아들이실 수 있습니다.
        3. 객체 초기화 : 생성자는 객체의 필드 초기화를 담당한다.


    생성자의 정의 방식
        1. 기본 생성자 : 매개변수가 없는 생성자(사실 클래스를 만들 때 default로 생성되어 정의하지 않아도 될 때가 있음)
            ClassA에서 기본 생성자를 정의하지 않고, ClassAMain에서 객체를 생성해봤었습니다. - 복습하시면 됩니다.
        2. 매개변수 생성자 : 하나 이상의 매개변수를 가지는 생성자
 */
public class Constructor {

    // 필드(속성) 선언
    int num;
    String name;

    // 기본 생성자를 직접 만들게 됐을 경우 -> call1() 유형과 같은 형태가 된다고 볼 수 있습니다 위에 필기 참조할 것
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    // 매개변수 생성자 -> 기본적으로 만들어지지 않습니다. 개발자가 정의해야 함. call2() 형태가 됩니다.
    Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number; // this : 해당 클래스에서 객체를 만들게 되면 객체 이름으로 대체되는 부분.
    }

    // String title을 매개변수로 하는 생성자를 만들고,
    // "RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)",
    // ConstructorMain으로 가셔서
    // 객체명을 constructor2로 지으시고, title = "여러분이름"으로 지어서 생성하신 후에
    // sout(constructor2.name)을 출력하세요.
    Constructor(String title) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
        this.name = title;
    }

    // 필드를 전부 다 대입하는 즉, 복수의 매개변수를 사용하는 AllArgsConstructor를 만들어보시고,
    // ConstructorMain으로 가셔서
    // 객체명을 constructor3로 지으시고, number = 10, title = "김철수"으로 지어서 생성하신 후에
    // sout(constructor3.num)을 출력하세요.
    // sout(constructor3.name)을 출력하세요.
    Constructor(int number, String title) {
        // 여기에 알아서 코드 입력하시고, 그 다음에 ConstructorMain 나머지 지시사항을 작성하시면 되겠죠.
        System.out.println("AllArgsConstructor");
        this.num = number;
        this.name = title;
    }

    // 이상의 코드들은 전부 생성자와 관련돼있고 이는 속성을 대입하는 방식이지
    // 객체의 행위(method)에 대한 정의는 하지 않았기 때문에
    // 이하에서 정의할 예정 -> 여기서는 객체의 필드 정보들을 출력하는 메서드를 정의할겁니다.

    // 그럼 얘는 call1() 형식으로 정의된거라고 볼 수 있습니다.
    void showInfo() {
        System.out.println("해당 객체의 num 값 : " + num);
        System.out.println("해당 객체의 name 값 : " + name);
    }

    // call3()형식으로 정의하면
    String showInfo2() {
        return "해당 객체의 num 값 : " + num + "\n" + "해당 객체의 name 값 : " + name;
    }

    // constructor2를 기준으로 showInfo()와 showInfo2()를 ConstructorMain에서 호출하고 콘솔창에 정보가
    // 출력되도록 작성하시오.
}
