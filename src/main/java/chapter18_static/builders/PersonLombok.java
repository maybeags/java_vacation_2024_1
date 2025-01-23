package chapter18_static.builders;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class PersonLombok {
    // 필드 선언 -> Person과 동일하게
    private String name;
    private int age;
    private String address;
}
