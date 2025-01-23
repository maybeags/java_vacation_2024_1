package chapter18_static.singleton;

import lombok.AllArgsConstructor;

/*
    chapter18_static.sigleton 패키지 생성
    Factory.java
    FactoryMain.java

    싱글톤 패턴(Singleton Pattern)
        : 소프트웨어 '디자인 패턴'중 하나로, 어떤 클래스가 하나의 인스턴스만 갖도록
        보장하고, 그 인스턴스에 접근할 수 있는 전역적인 접근법을 제공하는 패턴.
        예를 들어, 데이터베이스 연결과 같은 리소스는 프로그램 전체에서 하나의
        인스턴스만 사용해야 할 때가 많기 때문에 싱글톤 패턴이 유용함.

    특징 :
        1. 하나의 인스턴스만 존재 : 하나의 인스턴스만 생성되고, 이 인스턴스는
            프로그램이 실행되는 동안 유지.
        2. 전역 접근법 : 싱글톤 인스턴스는 정적(static) 메서드를 통하여
            어디서든 접근할 수 있음.
            -> 객체명.메서드명() x  / 클래스명.메서드명() o
        3. 인스턴스의 생명 주기 관리 : 클래스 자체가 인스턴스 생성을 관리하므로,
            다른 객체들이 직접 인스턴스를 생성하거나 폐기할 수 없음.

    장점 :
        1. 메모리 절약 : 불필요한 인스턴스 생성을 방지하여 메모리 절약 가능
        2. 글로벌(전역적) 접근 : 전역적을로 접근할 수 있어 관리가 용이
            -> 하지만 잦은 접근 자체는 단점
        3. 일관성 유지 : 애플리케이션 전반에서 하나의 인스턴스만 사용하기 때문에
            상태 일관성을 유지
    단점 :
        1. 테스트 어려움 : 싱글톤 패턴은 전역적으로 사용되므로 단위 테스트가 어려울
            수 있음 -> 단위 테스트는 보통 메서드 단위 입니다.
        2. 의존성 숨김 : 싱글톤을 남용하면 클래스 간의 의존성을 추적하기 어려울 수 있음.
 */
@AllArgsConstructor
public class Factory {
    // 필드 선언
    private String factoryName;

    // 생성자 정의 필요 없음 -> 애너테이션 때문에

    //메서드 정의
    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");

        String model = "갤럭시S25";
        String serial = null;

        // 싱글톤 패턴이 적용된 Samsung의 인스턴스를 가지고 오기
        Samsung samsung = Samsung.getInstance();        // -> 여기서 인스턴스가 이미 있다면
                                                        // getInstance() 메서드를 확인했을 때
                                                        // 기존의 객체가 반환
                                                        // 없다면 지금 생성해서 반환

        serial = samsung.createSerialNumber(model);     // 마찬가지로 Samsung 클래스에서 확인해보면
                                                        // 20250001부터 시작하게 될겁니다.

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);
        return smartPhone;
    }
}
