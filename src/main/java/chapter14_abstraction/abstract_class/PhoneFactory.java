package chapter14_abstraction.abstract_class;

public class PhoneFactory extends Factory{

    // 생성자 및 메서드를 일일이 복사 및 타이핑할 필요 x -> 빨간줄 뜬거 클릭클릭했다

    // TabletFactory에 지금 빨간줄 있는데 딸깍x2 하셔서 이까지 구현하세요.

    public PhoneFactory(String name) {
        super(name);
    }

    @Override               // 슈퍼 클래스의 추상 클래스를 '재정의'하여 구현부를 작성
    public void produce(String model) {
        System.out.println(" [ " + model + " ] 모델 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
