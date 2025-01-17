package chapter15_casting.centralcontrol;
/*
    centralcontroll package 생성
    Main.java -> 클래스
    Power.java -> 인터페이스
    CentralControll.java-> 클래스
    Computer.java -> 클래스
 */
public class Main {
    public static void main(String[] args) {
        // 각 클래스의 객체를 생성하세요.
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Speaker speaker1 = new Speaker();
        CentralControl centralControl = new CentralControl(new Power[3]);   // 이거 interfaces에서 배운 방식인데
        // 생성자의 argument로 'new 클래스()' 즉, 생성자를 집어넣은 케이스를 한 번 더 응용해서 걔가 배열이기까지 합니다.
    }
}
