package chapter10_setter_getter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivStudent student01 = new UnivStudent();
        UnivStudent student02 = new UnivStudent("김이");
        UnivStudent student03 = new UnivStudent(3);
        UnivStudent student04 = new UnivStudent("김사", 4);
        UnivStudent student05 = new UnivStudent("김오", 1, 1);

        student01.setGrade(1);
        student01.setScore(3.3);
        student01.setName("김일");

        student02.setGrade(2);
        student02.setScore(4);

        student03.setName("김삼");
        student03.setScore(2.7);

        student04.setScore(3.8);

        student01.showInfo();

        student02.showInfo();

        student03.showInfo();

        student04.showInfo();

        student05.showInfo();

    }
}
