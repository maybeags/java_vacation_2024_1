package chapter14_abstraction.interfaces;
/*
    인터페이스(interface)
        인터페이스는 자바에서 클래스가 구현해야 하는 '메서드들'의 집합을
        정의하는 일종의 규약(protocol)

        인터페이스는 메서드의 시그니처(메서드 이름, 리턴 타입, 매개변수 목록)만을
        포함하며, 메서드의 실제 구현은 포함하지 않음
            -> 추상 메서드와 유사한 점

        다중 상속을 지원 -> 이를 통해 클래스가 여러 인터페이스를 구현할 수 있음
            : chapter13에서 언급했듯이 일반/추상 클래스의 경우 하나의 클래스만 상속 가능

        특징
            1. 추상 메서드 : 인터페이스 내의 모든 메서드는 기본적으로 추상 메서드
            2. 상수 : 인터페이스 내에서 선언된 변수는 '자동으로' public static final
                상수로 취급됨
            3. 다중상속 : 클래스는 여러 인터페이스를 구현할 수 있다.

        추상 클래스와의 공통점
            - 모두 추상 클래스를 포함할 수 있고, 이를 서브 클래스에서 구현해야한다.

        추상 클래스와의 차이점
            - 추상 클래스
                1. 부분 구현 허용 : 추상 클래스는 추상 메서드 뿐만 아니라 일반 메서드도
                    포함할 수 있다.
                2. 상태 저장 가능 : 추상 클래스는 인스턴스 변수(상태)를 가질 수 있다.
                3. 단일 상속 : 클래스는 하나의 추상 클래스만 상속 받을 수 있다.
                4. 생성자 : 추상 클래스는 생성자를 가질 수 있다.
                5. 다양한 접근 제어자(Access Modifier) : 추상 클래스의 메서드와 변수는
                    다양한 접근 제어자(public, protected, private)를 가질 수 있다.

            - 인터페이스
                1. 완전한 추상화 : 인터페이스는 기본적으로 모든 메서드가 추상 메서드
                    Java 8 이후에 default, static 메서드를 사용할 수 있긴 합니다.
                2. 인터페이스는 인스턴스 변수(필드 중 객체마다 값이 달라지는 변수)를 가질
                    수 없고, 상수만 선언 가능
                3. 다중 상속 : 클래스는 여러 인터페이스를 구현할 수 있다.
                4. 생성자 없음 : 인터페이스는 생성자를 가질 수 없다
                    -> 일단 필드에서 객체마다 다른 값을 가지게 되는 인스턴스 변수가 없기
                    때문에 생성자 생성이 불가능 -> 객체마다 다른 값을 가질 수 없다는 의미
                5. 자동 public : 인터페이스의 메서드들은 자동으로 public이며, 메서드
                    선언에 접근 제어자를 명시할 필요가 없다
                    Java 8 이후에 default, static 메서드를 사용할 수 있긴 합니다.
 */
public class Main {
    public static void main(String[] args) {
        // RemoteController 클래스의 객체 생성
        RemoteController remoteController = new RemoteController(
                new PowerButton(), new VolumeDownButton(),
                new VolumeUpButton(), new ChannelDownButton(),
                new ChannelUpButton());
        /*
        RemoteController remoteController = new RemoteController();까지 입력했을 경우
        RemoteController.java 내부에 생성자는 AllArgsConstructor이기 때문에 오류 발생합니다.
        그렇다면 내부에 들어가야 할 argument들을 채울 필요가 있습니다.

        여기서 여태까지와 다른 방식으로 argument들을 채우기 때문에 유의해야 합니다.

        RemoteController의 객체를 생성 했고, 객체명이 remoteController입니다.
        클래스명1 객체명 = new 생성자(argument1, argument2, ...);
        클래스명1 객체명 = new 생성자(new 클래스명2(), new 클래스명3());

        이상의 경우, new 클래스명2(), new 클래스명3()을 통해 객체 생성은 이미 '완료'됐습니다
            -> 생성자의 정의를 확인하세요.
        다만 argument로 들어가있는 객체들은 '객체명이 없다'
     */
//        remoteController.onPressedPowerButton();
//        remoteController.onUpVolumeUpButton();
//        remoteController.onPressedVolumeUpButton();
//        remoteController.onDownChannelDownButton();
//        remoteController.onPressedChannelDownButton();

        remoteController.onPressedPowerButton();
        remoteController.onPressedPowerButton();
        System.out.println();
        remoteController.onPressedChannelUpButton();
        remoteController.onPressedChannelDownButton();
        remoteController.onUpChannelUpButton();
        remoteController.onDownChannelDownButton();

    /*
        1. ChannelDownButton, ChannelUpButton 클래스를 만들고 method들을 구현하세요. -> extends
        2. RemoteController.java의 필드에 위에 만든 클래스들의 객체를 추가하세요.
        3. RemoteController의 AllArgsConstructor가 2를 추가하게 되면 깨지게 되므로 수정하세요.
        4. RemoteController.java에 ChannelDown/UpButton과 관련된 method들 추가하세요.
        5. Main으로 넘어와서, 채널 한 칸 내리기, 계속 내리기, 한 칸 올리기, 계속 올리기를
            실행하세요.

            실행 예
            전원이 켜졌습니다.
            전원이 꺼졌습니다.

            채널을 한 칸 내립니다.
            채널을 한 칸 올립니다.
            채널을 계속 내립니다.
            채널을 계속 올립니다.


            지시 사항 풀이법
                1) ChannelUpButton 클래스를 만드세요 ->
     */

        /*
            과제 2

            TemparatureDownButton, TemparatureUpButton, AirConditionerController.java 클래스를 만들고
            정의해서
            Main에 AirConditionerController의 객체를 생성한 후

            전원이 켜졌습니다.

            온도를 한 칸 내립니다.
            온도를 계속 내립니다.

            온도를 한 칸 올립니다.
            온도를 계속 올립니다.

            전원이 꺼졌습니다.
         */
        // 객체 생성
        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(), new TemperatureDownButton(), new TemperatureUpButton());

        airConditionerController.onPressedPowerButton();
        System.out.println();
        airConditionerController.onPressedTemperatureDown();
        airConditionerController.onDownTemperatureDown();
        System.out.println();
        airConditionerController.onPressedTemperatureUp();
        airConditionerController.onUpTemperatureUp();
        System.out.println();
        airConditionerController.onPressedPowerButton();
    }
}
