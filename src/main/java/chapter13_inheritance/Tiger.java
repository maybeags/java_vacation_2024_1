package chapter13_inheritance;

public class Tiger extends Animal{          // 클래스명 extends 부모클래스 명령어를 통해 상속 가능

    public Tiger() {
    }

    public Tiger(String animalName) {
        super(animalName);                      // super 키워드
    }

    public Tiger(int animalAge) {
        super(animalAge);
    }

    public Tiger(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    // @Override가 붙어있다면 해당 메서드는 상속 받은 메서드임을 의미함.

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    // Animal 클래스에서 정의한 메서드를 오버라이드했습니다.
    // Override의 키워드 -> 재정의

    @Override
    public void move() {
        super.move();       // super()의 경우는 생성자에 해당. // super.메서드명()의 경우는 부모 클래스의 메서드를 호출

        //재정의하는 영역
        System.out.println("네 발로 걷습니다.");
    }

    // Tiger 클래스만의 메서드
    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }

}
