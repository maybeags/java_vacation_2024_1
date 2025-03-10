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
        Speaker speaker2 = new Speaker();           // 실패 사례용

        // Mouse 객체를 만들어야, Centralcontrol 객체에 집어넣고, 켜고 끄는 것이 가능
        Mouse mouse1 = new Mouse();
        Tv tv1 = new Tv();

        CentralControl centralControl = new CentralControl(new Power[6]);   // 이거 interfaces에서 배운 방식인데
        // 생성자의 argument로 'new 클래스()' 즉, 생성자를 집어넣은 케이스를 한 번 더 응용해서 걔가 배열이기까지 합니다.


        centralControl.addDevice(computer1);
        centralControl.addDevice(led1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker2);         // 실패 사례용으로 코드 하나 작성했습니다.
        centralControl.addDevice(mouse1);
        centralControl.addDevice(tv1);


//        speaker2.on();
//        speaker2.off();
//        System.out.println("↑얘는 배열에 포함 안된 애입니다.");
        centralControl.powerOn();
        System.out.println("↓끄는 부분");
        centralControl.powerDown();

        /*
            20250120 수업 시작시 예정 사항
            1. CentralControl에 displayinfo()를 call1() 타입으로 정의해서
                centralControl 객체 내에 있는 필드인 deviceArray에 들어있는 element를 조회할 수 있도록
                코드를 작성하시오.
                실행 예
                현재 연결된 장치 목록
                [ Computer, LED, Speaker, Speaker, null, null ] -> 배열 전체 출력

            2. Tv 클래스 및 Mouse 클래스를 작성하고
                Main 단계에서 centralControl 객체에 집어넣으시고,
                .powerOn() 시켜보세요.
                ---------이까지 과제 작성하시는데 맥시멈 10시 10분에는 전체 풀이가 끝나있을 겁니다--------

            3. 이상까지 하게되면 Computer/Speaker/LED/Tv/Mouse라는 각 객체가 Power로 암시적 업캐스팅을 하여
                오버라이드된 메서드들을 일괄적으로 실행시킨 사례에 대한 공부가 끝이 납니다.
                다음에 제 수업 시작시에는 명시적 다운 캐스팅을 통해 각 클래스의 객체들이 가지고 있는
                고유 메서드들을 실행시킬 수 있도록 프로그램을 버전업할 예정입니다.

         */
        centralControl.displayInfo();
        //[chapter15_casting.centralcontrol.Computer@7adf9f5f, chapter15_casting.centralcontrol.LED@85ede7b, chapter15_casting.centralcontrol.Speaker@5674cd4d, chapter15_casting.centralcontrol.Speaker@63961c42, null, null]
        // ↑ 배열 내부에 객체가 있기 때문에 이상의 메서드로는 객체의 주소만 출력된다는 문제점 있음 -> 다음 챕터에서 해결
        System.out.println("-----displayInfo2()-----");
        centralControl.displayInfo2();
        System.out.println("-----displayInfo3()-----");
        centralControl.displayInfo3();
        System.out.println("-----performSpecificMethod()-----");
        centralControl.performSpecificMethod();
    }
}
