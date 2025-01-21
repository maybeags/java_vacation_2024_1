package chapter16_objects.students;
/*
    1. 해당 클래스에 학생의 이름(name), 학번(studentId)를 저장하는 필드 작성하시오.
    2. toString()을 Override받고 재정의하여 다음과 같이 콘솔창에 찍히도록 작성하시오.
        실행 예
        해당 학생의 학번은 20250121이고, 이름은 김일입니다.

    3. 해당 지시 사항을 만족하시오.
        1) Student 클래스는 name과 studentId를 private 접근 지정자로 가지고 있어야 함.
        2) AllArgsConstructor로 생성자를 만들어야 함.
            student1 = name ="안근수" / studentId = 20250001
            student2 = name = "여러분이름" / studentId = 20250002
    4. 각 필드 별로 setter / getter를 생성합니다.

    9시 45분경 전체 풀이 예정입니다 😃
 */
public class Student {
    private String name;
    private int studentId;

    // AllArgsConstructor 만드세요.
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Getter / Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // alt + insert -> toString(), hashCode(), equals()에 해당하는 메서드들도
    // 생성이 가능하다는 점을 알 수 있구요.
    // @Override 가 붙어있는 것을 봤을 때 기본적으로 Student.java에서 Student 클래스가
    // 무언가의 서브(자식) 클래스라는 점을 알 수 있는데, extends가 붙어있지 않습니다.
    // 왜? -> 어차피 모든 클래스의 부모는 Object 클래스이기 때문에
    // 너무 동어 반복이라서 Object 클래스의 자식 클래스인 경우 명시하지 않습니다.

    @Override
    public String toString() {
        // 재정의를 해야하는 영역
        return "해당 학생의 학번은 " + studentId
                + "이고, 이름은 " + name + "입니다.";
    }
}
