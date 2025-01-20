package chapter15_casting.centralcontrol;

public class Speaker implements Power{

    @Override
    public void on() {
        System.out.println("스피커의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커의 전원을 끕니다.");
    }

    public void changeMode() {
        System.out.println("스피커에서 음색 모드를 바꿉니다.");
    }
}
