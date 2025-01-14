package chapter13_inheritance;
/*
    Tiger.java에서처럼 Animal 클래스를 상속 받고
    생성자 및 getter / setter 다 정의하시고,
    Animal 클래스의 move() 메서드를 오버라이딩해서 "두 발로 걷습니다"를 출력할 수
    있도록 '재정의'를 하시고

    Main.java
    human1 객체 생성하신 다음에, setter를 이용해서 여러분들의 이름, 나이를 입력
    getter를 이용하여
    제 이름은 ___ 이고, 나이는 ___ 살 입니다. 라고 출력하시오.

    Human 클래스의 고유 메서드로 read("멘토 자바")를 정의하여 콘솔창에 출력합니다.

    실행 예
    두 발로 걷습니다.
    제 이름은 ___ 이고, 나이는 ___ 살 입니다. 라고 출력하시오.
    멘토 자바 책을 읽고 있습니다.
 */
public class Human extends Animal {
    public Human() {
    }

    public Human(String animalName) {
        super(animalName);
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

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

    @Override
    public void move() {
        // 재정의하시오.
        System.out.println("두 발로 걷습니다.");
    }

    // 고유 메서드 작성하시오.
    public void read(String bookTitle) {
        System.out.println(bookTitle + " 책을 읽고 있습니다.");
    }
}
