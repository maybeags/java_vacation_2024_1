package chapter19_generic;

import java.util.Date;

/*
    chapter19_generic 패키지 생성
    DataController
    Products
    ProductsController
    ResponseData 생성

    제네릭의 개념 및 정의
        제네릭은 클래스나 메서드가 다룰 데이터 타입을 미리 명시하여 재사용성과 유연성을
        높이는 기술

        타입 매개변수(Type parameter) : 클래스나 메서드에서 사용할 실제 타입을
            '대신하여' 사용하는 매개변수
            일반적으로 알파벳 대문자 한 글자로 표현함. T, E, K, V 등이 자주 사용됨.

            1. T(Type) : 일반적으로 클래스 타입을 나타낼 때 사용
            2. E(Element) : 컬렉션의 요소를 나타낼 때 사용
            3. K(Key) : 맵의 Key를 나타낼 때 사용
            4. V(Value) : 맵의 값(value) 또는 제네릭 타입의 반환값으로 사용.

            재사용성 : 제네릭을 사용하면 다양한 데이터 타입에 대해 하나의 클래스나
                메서드를 정의할 수 있어 코드의 재사용성을 높이고 중복을 줄입니다.

            타입 안정성(Type Safety) : 컴파일 시점에 타입 체크를 할 수 있어
                프로그램의 안정성을 높이고, 명시적인 형변환을 줄임.
 */
public class DataController {
    public static void main(String[] args) {
        Date now = new Date();  // 자바 내장 클래스로 객체 만들었습니다.

        ResponseData<String> responseData1 = new ResponseData<>("날짜 저장 성공", now.toString());
        //Java8 이후에 바뀐 점 중 하나입니다.
//ResponseData<String> responseData1 = new ResponseData<String>("날짜 저장 성공", now.toString());
//이라고 생성자 뒤에서 제네릭 타입을 명시해줬어야 했는데, 바뀌고 나서부터는 중복이라고
// 안적어도 되게 해줬습니다. 덜 귀찮아졌어요.

        System.out.println(responseData1);

        ResponseData<Integer> responseData2 = new ResponseData<>("나이 표시 : ", 38);

        System.out.println(responseData2);
        // 여기서 Integer라는 단어가 처음 언급되는데, 얘는 int의 class 버전이라고 생각하시면 됩니다.
        // 일단 제네릭 내부에는 기본 자료형이 들어갈 수 없기 때문에 <int>로 쓰는 것은 불가능하고.
        // 저희가 학습한 비슷한 사례로는 char -> String / int -> Integer / double -> Double

        ResponseData<Date> responseData3 = new ResponseData<>("날짜 객체 저장 성공", now);
        System.out.println(responseData3);
        // now가 객체라는 점을 33번 라인에서 확인할 수 있습니다.
        // ResponseData 클래스에 @ToString을 적용했기 때문에 now 객체가 출력 가능합니다.
    }

}
