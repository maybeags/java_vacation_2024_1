package chapter15_casting.animals;

public class Dog extends Animal{

    @Override
    public void makeSound() {
//        super.makeSound();
        // 상위 클래스의 makeSound() 메서드를 호출하는 키워드 super
        // @Override 했기 때문에 슈퍼 클래스의 method 명을 그대로 가지고 오기는
        // 하지만, 항상 슈퍼 클래스의 구현부를 호출해야만 하는 것은 아니다.
        // -> 재정의만 해도 괜찮습니다.
        System.out.println("강아지가 짖습니다.");
    }

    // Dog만의 method
    public void fetch() {
        System.out.println("강아지가 공을 물어옵니다.");
    }
}
