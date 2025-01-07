package chapter09_classes.students;

public class Student {
    // field 정의
    int studentCode;
    String name;
    String score;

    Student() {};

    Student(int studentCode) {
        this.studentCode = studentCode;
    }

    Student(String name) {
        this.name = name;
    }

    Student(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    void showInfo() {
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);

    }
}
