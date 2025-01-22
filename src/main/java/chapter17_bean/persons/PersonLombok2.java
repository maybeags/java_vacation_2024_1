package chapter17_bean.persons;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // 얘는 @Data에 포함돼있지 않기 때문에 추가로 달아주실 필요가 있습니다.
public class PersonLombok2 {
    private final String name;
    private int age;


    // @Data를 달아서 전체 종합 패키지를 사용 했지만 toString() 메서드의 재정의가 필요한 경우
    // 결국 alt + insert를 통해서 toString() 메서드를 불러와 추가로 재정의를 해야 함.
    @Override
    public String toString() {
        return
                "이름 : " + name + '\n' +
                "나이 :" + age;
    }
}
