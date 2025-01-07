package chapter09_classes.students;
/*
    학번, 이름, 점수(ABCDF) field를 선언합니다.
    기본 생성자
    학번을 매개변수로 하는 생성자
    이름을 매개변수로 하는 생성자
    학번, 이름, 점수를 매개변수로 하는 생성자

    showInfo() 메서드를 정의
    학번 : 12345
    이름 : 이일
    점수 : A등급

    student1 = 이일 (위에거 참조)
    student2 = 201133151 안근수 A(학번 매개변수 생성자)
    student3 = 202565121 안근순 F(이름 매개변수 생성자)
    student4 = 30805 여러분이름 100(AllArgsConstructor 이용해서 생성)

    전부 다 showInfo() -> 위에 형식을 확인하고 저 형식대로 콘솔에 찍히도록 메서드를 정의하세요.

 */
public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(201133151);
        Student student3 = new Student("안근순");
        Student student4 = new Student(30805, "김이");
        // 각 객체에 field 입력하는 코드 작성

        student1.studentCode = 12345;
        student1.name = "이일";
        student1.score = "A등급";

        student2.name = "안근수";
        student2.score = "A등급";

        student3.studentCode = 202565121;
        student3.score = "F등급";

        student4.score = "100점";

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
    }
}
