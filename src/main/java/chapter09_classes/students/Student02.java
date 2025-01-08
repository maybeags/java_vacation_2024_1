package chapter09_classes.students;
/*
    생성자를 자동 생성하는 방법

    메뉴바(햄버거) 클릭 - code(코드) - generate(생성)으로 들어가서 constructor(생성자) 클릭
    단축키 : alt + insert

    어떤 필드를 기준으로 생성자를 만들지 선택하시면 됩니다(아무것도 선택하지 않으면 기본생성자 / 복수 선택이 가능)

    타이핑 끝나신 분들은
    chapter10_setter_getter 패키지를 생성
    SetterGetter.java           -> setter/getter 개념 설명만 하고 코드 안쓸겁니다.
    Person.java                 -> 과제 파일
    PersonMain.java             -> 과제 파일
 */
public class Student02 {

    int studentCode;
    String name;
    double score;

    public Student02() {
    }

    public Student02(int studentCode) {
        this.studentCode = studentCode;
    }

    public Student02(String name) {
        this.name = name;
    }

    public Student02(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student02(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student02{" +
                "studentCode=" + studentCode +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
