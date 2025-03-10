package chapter15_casting.centralcontrol;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }

    // 다운 캐스팅을 학습하기 위한 Computer 클래스만의 고유 메서드
    public void compute() {
        System.out.println("컴퓨터에서 계산을 수행합니다.");
    }
}
/*
    이것과 같은 방식으로
    LED 클래스, Speaker 클래스를 만들고, Power를 inplement해서
    각각 --의 전원을 켭니다 / 끕니다로 on, off 메서드를 재정의하시오.
 */
