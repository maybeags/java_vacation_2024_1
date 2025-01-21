package chapter16_objects.teachers;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        // .equals() 메서드의 메커니즘 검증 -> 동일한 필드를 지닌 객체 두개를 생성
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");

        // teacher1 객체의 클래스 정보를 얻기
        Class tClass = teacher1.getClass();
//        System.out.println(tClass); // ↓
        //결과값 : class chapter16_objects.teachers.Teacher -> 패키지 경로부터 클래스명까지 출력
//        System.out.println(tClass.getSimpleName()); // 결과값 : Teacher

//        System.out.println(teacher1); // ↓
        // 결과값 : Teacher{name='안근수', shcoolName='코리아아이티'}

        // 클래스의 모든 필드(Field) 정보 출력을 하는 반복문
        Field[] fields = tClass.getDeclaredFields(); // 선언돼있는 필드들이 여러개일 수 있으므로 배열로
//        for( int i = 0 ; i < fields.length ; i++ ) {
//            System.out.println("필드명 출력 : " + fields[i].getName());    // 필드명만 출력
//            System.out.println("패키지+클래스명 출력 : " + fields[i].getType());    // 패키지명.클래스명이 출력
//            System.out.println("클래스명 출력 " + fields[i].getType().getSimpleName());    // 클래스명만 출력
//        }

        // 위의 일반 for문으로 작성된 코드 라인을 향상된 for문으로 작성하시오.
//        for (Field field : fields) {
//            System.out.println("필드명 출력 : " + field.getName());    // 필드명만 출력
//            System.out.println("패키지+클래스명 출력 : " + field.getType());    // 패키지명.클래스명이 출력
//            System.out.println("클래스명 출력 " + field.getType().getSimpleName());
//        }

        // 클래스의 모든 메서드(Method) 정보를 출력하는 반복문
        Method[] methods = tClass.getDeclaredMethods();
//        for (int i = 0 ; i < methods.length ; i++) {
//            System.out.println("메서드 명 출력 : " + methods[i].getName());
//            System.out.println("리턴 타입 출력 : " + methods[i].getReturnType());
//        }

        // 향상된 for문으로 작성하시오.
//        for (Method method : methods) {
//            System.out.println("메서드 명 출력 : " + method.getName());
//            System.out.println("리턴 타입 출력 : " + method.getReturnType());
//        }

        // 근데 뭐 어차피 출력된 것만 확인할건데 굳이굳이 반복문으로 쓸 필요 없습니다.
        // Arrays.toString()을 사용할 수도 있죠.
//        System.out.println(Arrays.toString(fields));
//        System.out.println(Arrays.toString(methods));
        // ↑ 배열 전체 출력 사례 -> 패키지 경로가 전부 출력되기 때문에 좀 가독성이 떨어진다.


        System.out.println(teacher1.getClass() == teacher2.getClass()); // true
        // 각 객체가 동일한 클래스에서 생성된 인스턴스인지 확인
        System.out.println(teacher1 instanceof Teacher);
        // true - teacher1이 Teacher클래스의 인스턴스인지 확인

        chapter16_objects.Teacher teacher3 = new chapter16_objects.Teacher("안근수", "코리아아이티");
        // teacher3의 경우에는 Teacher 클래스의 인스턴스이기는 하지만 경로가 다릅니다.
        // 같은 패키지 내에 있는 Teacher와 방금 teacher3에 적용된 클래스는 코드라인은 동일하다고 볼 수 있습니다.

//        System.out.println(teacher3 instanceof Teacher);
        // teacher3의 경우 다른 경로에0 있는 Teacher 클래스의 인스턴스이기 때문에
        // 66라인의 코드가 실행 불가.

        System.out.println(teacher1.getClass() == Teacher.class);   // true
        System.out.println(teacher2.getClass() == Teacher.class);   // true
//        System.out.println(teacher3.getClass() == Teacher.class);   // 이상과 같은 이유로 오류 발생


    }
}
