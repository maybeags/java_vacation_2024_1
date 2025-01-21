package chapter16_objects.teachers;

import java.lang.reflect.Field;

public class TeacherMain {
    public static void main(String[] args) {
        // .equals() 메서드의 메커니즘 검증 -> 동일한 필드를 지닌 객체 두개를 생성
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");

        // teacher1 객체의 클래스 정보를 얻기
        Class tClass = teacher1.getClass();
        System.out.println(tClass); // ↓
        //결과값 : class chapter16_objects.teachers.Teacher -> 패키지 경로부터 클래스명까지 출력
        System.out.println(tClass.getSimpleName()); // 결과값 : Teacher

        System.out.println(teacher1); // ↓
        // 결과값 : Teacher{name='안근수', shcoolName='코리아아이티'}

        // 클래스의 모든 필드(Field) 정보 출력을 하는 반복문
        Field[] fields = tClass.getDeclaredFields(); // 선언돼있는 필드들이 여러개일 수 있으므로 배열로
        for( int i = 0 ; i < fields.length ; i++ ) {
            System.out.println("필드명 출력 : " + fields[i].getName());    // 필드명만 출력
            System.out.println("패키지+클래스명 출력 : " + fields[i].getType());    // 패키지명.클래스명이 출력
            System.out.println("클래스명 출력 " + fields[i].getType().getSimpleName());    // 클래스명만 출력
        }
    }
}
