package chapter10_setter_getter.univ_student;
/*
    chapter10_setter_getter 우클릭 -> new -> package -> chapter10_setter_getter.univ_student입력
    univ_student 우클릭 -> new -> class -> UnivStudent 클래스 생성

    1. 클래스 설계
        field 종류 : name / grade / score (score는 double) -> 근데 전부 private

    2. 생성자
        1) 기본 생성자
        2) 이름만 받는 생성자
        3) 학년만 받는 생성자
        4) 이름과 학년을 받는 생성자
        5) 이름, 학년, 점수를 받는 생성자

    3. Setter/Getter 메서드 정의
        각각의 필드에 대한 Setter / Getter 만듭니다.    Setter 3개 / Getter 3개
         1) setGrade의 범위 1 ~ 4학년
         2) setScore의 범위 0.0 ~ 4.5

     4. UnivStudentMain.java
            student01 객체 -> 기본생성자 이용 김일 / 1 / 3.3
            student02 -> 이름만 받는 생성자 김이 / 2 / 4.0
            student03 -> 학년만 받는 생성자 김삼 / 3 / 2.7
            student04 -> 이름과 학년을 받는 생성자 김사 / 4 / 3.8
            student05 -> 이름 학년 점수를 받는 생성자 김오 / 1 / 1.0

     5. 콘솔창에
            이름 : 김일
            학년 : 1 학년
            점수 : 3.3
        로 출력될 수 있도록 showInfo() 메서드를 UnivStudent.java에 추가하세요.



 */
public class UnivStudent {
    // 필드
    //    1. 클래스 설계
    //        field 종류 : name / grade / score (score는 double) -> 근데 전부 private
    private String name;
    private int grade;
    private double score;

    // 여기까지 작성했다고 가정했을 때 -> 기본 생성자는 일단 default -> Main만들어서

    // alt + insert 사용 -> 생성자 5개

    public UnivStudent() {
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    // 3. setter / getter : alt + insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {           // set 조건 필요
        if (grade > 0 && grade < 5){
            this.grade = grade;
        } else {
            System.out.println("잘못된 학년을 입력하셨습니다.");
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {        // set 조건 필요
        if (score >= 0 && score <= 4.5){
            this.score = score;
        } else {
            System.out.println("잘못된 점수를 입력하셨습니다.");
        }
    }

    public void showInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("학년 : " + this.grade + " 학년");
        System.out.println("점수 : " + this.score);
        System.out.println();
    }
}
