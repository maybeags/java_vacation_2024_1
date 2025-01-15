package chapter14_abstraction.interfaces;
/*
    아까 전에 Button 클래스의 경우에는 인터페이스를 다중 상속 받았습니다.
    즉, Press, Up, Down이 가지고 있는 각각의 특징을 Button 클래스에
    모아놨다고 볼 수 있을 겁니다.
    이를 PowerButton, ChannelUpButton, ChannelDownButton 등으로
    나누어 Button 클래스를 상속하도록 작성할 예정.
 */
public class PowerButton extends Button{

    private boolean status;

    @Override
    public void onPressed() {
        // 나머지는 20250116 작성하겠습니다.
    }
}
