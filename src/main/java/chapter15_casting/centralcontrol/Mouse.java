package chapter15_casting.centralcontrol;
/*
    지시 사항 2번

    Mouse.java 클래스 생성
    implements Power 입력해서 빨간 줄 뜨면 빨간 줄 위에 커서 올립니다.
    implement methods -> 클릭합니다.
 */
public class Mouse implements Power{
    @Override
    public void on() {
        System.out.println("마우스의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스의 전원을 끕니다.");
    }

    public void leftClick() {
        System.out.println("마우스 왼쪽 버튼 클릭합니다.");
    }
}
/*
    Override한 메서드들을 다 재정의한 이후에
    Main.java로 넘어갑니다.
 */
