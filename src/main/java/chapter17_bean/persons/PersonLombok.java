package chapter17_bean.persons;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor    // 얘가 적용되니까 final 밑에 빨간줄 사라졌습니다.
// -> final 붙은 필드를 필수적으로 포함한 생성자를 만든다는 의미
@AllArgsConstructor // 얘는 모든 필드를 대상으로 하는 생성자를 만들어준다는 의미
// -> 두 개의 필드를 전부 사용한 애입니다.
//@ToString   // toString() 메서드를 사용 가능 하긴 하지만 default만 가능 -> 재정의가 불가능
public class PersonLombok {
    private final String name;
    private int age;


    // Lombok 애너테이션을 적용하여 생성자 / getter / setter를 만들어줍니다.
    // PersonMain으로 가서
    // Person 클래스의 객체 person1을 생성하시고 -> 이름 - 안근수 / 나이 - 38
    // PersonLombok 클래스의 객체 person2를 생성하시고 -> 이름 - 여러분 이름 / 나이 - 여러분 나이
    // toString() 메서드를 정의해서
    // 실행 예
    // 이름 : 안근수
    // 나이 : 38
    // 로 콘솔에 출력될 수 있도록 작성하시오.


    @Override
    public String toString() {
        return
                "이름 : " + name + '\n' +
                "나이 :" + age;
    }
}
