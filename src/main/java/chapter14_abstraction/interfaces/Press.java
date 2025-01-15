package chapter14_abstraction.interfaces;

public interface Press {
    // 5번 라인의 의미는 실제로는 public final String NAME = "button";이란 뜻
    String NAME = "button"; // 상수이기 때문에 선언과 동시에
                            // 초기화가 이루어져야 함.
                            // 마찬가지로 상수이기 때문에 개발자들이 얘가 상수인지
                            // 알 수 있도록 대문자로만 표기

                            // interface에서는 자동으로 final이 붙은 것으로 식별

    // 안되는 것들 예시
//    private String name;    // 필드 선언 불가능
//    public Press();         // 생성자 선언 불가능

//    String pop() {          // 구현부가 있는 일반 메서드 선언 불가능
//        System.out.println("일반메서드입니다.");
//        return "안되야하는데";
//    };
    // public 적어두면 회색으로 비활성화되는데
    // 인터페이스에서는 메서드들이 기본적으로 public입니다.

    // 되는 것 정의 -> 추상 메서드 정의
    void onPressed();

    /*
        Up에 onUp / Down에 onDown을 void 형태로 선언하시오.
     */
}
