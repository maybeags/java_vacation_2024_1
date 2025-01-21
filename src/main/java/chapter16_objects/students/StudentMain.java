package chapter16_objects.students;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("안근수", 20250001);
        Student student2 = new Student("김일", 20250002);

        // .toString() 형태로 쓰지 않아도 됩니다.
        // Arrays.toString() 으로 썼잖아요? -> 얘가 예외
        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
    }
}
