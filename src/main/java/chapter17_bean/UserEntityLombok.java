package chapter17_bean;

import lombok.Getter;
import lombok.Setter;

/*
    ctrl + alt + s입니다.
    command + , 하시면 설정창이 열립니다.

    Lombok -> 설치과정

    settings에서 좌측 하단 쪽에 plugins에서 lombok 검색 -> 설치
    enable까지 처리합니다.

    chrome mvn 검색 -> lombok 검색 -> projectlombok 선택하고 버전 선택하시고,
    build system에 맞게 의존성을 build.gradle(저희 기준) 추가하면 됩니다.
    maven의 경우에는 pom.xml에 추가함.
    -> 이후에 코끼리 새로고침 꼭 하셔야합니다.

    Lombok
        자바에서 반복적으로 작성해야 하는 코드(boilerplate code)를 자동으로 생성해주는
        라이브러리

        장점 :
            코드의 가독성을 높일 수 있다 -> 주석을 통한 애너테이션을 붙여 코드 생성을 제어 가능
            특히 스크롤링해서 특정 필드의 setter가 있는지 없는지에 대해 고려할 필요 없이
            @ 파트만 보더라도 대략적인 코드의 흐름을 알 수 있음.

        1. @Data
            - @Getter, @Setter, @RequiredArgsConstructor, @ToString @EqualAndHashCode
            애너테이션을 전부 포함한 종합 패키지에 해당
        2. @NoArgsConstructor
            - 기본 생성자를 생성
        3. @RequiredArgsConstructor
            - final 또는 @NonNull로 지정된 필드를 매개변수로 받는 생성자를 생성
        4. @Getter / @Setter
            - 각 필드에 대해 getter / setter 메서드들을 생성
            - 클래스 레벨에 사용하면 모든 필드에 대해, 필드 레벨에 사용하면 특정 필드에 대해서만
                getter / setter가 생성됨 -> 저희는 아까 예시로 보여드렸을 때 클래스 레벨에만 적용했습니다.

            - 단, @Setter의 경우 final 필드에는 setter가 생성되지 않습니다.

        5. @EqualAndHashCode
            - equals()와 hashCode() 메서드를 자동으로 생성 -> 둘이 세트로 만들어야 하기 때문에 묶여있음

        6. @toString
            - toString() 메서드를 자동으로 생성
            - 객체의 필드 값을 문자열로 표현해주는 메서드




 */
@Setter
@Getter
public class UserEntityLombok {
    private String username;
    private String password;
    private String email;
    private String name;
    private int age;
}
