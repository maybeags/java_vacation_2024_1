package chapter14_abstraction.interfaces;
/*
    extends Button을 통해 Button 클래스를 상속 받고, 빨간줄 뜨는거 클릭해서 implements하세요
 */
public class ChannelUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public void onUp() {
        System.out.println("채널을 계속 올립니다.");
    }
    /*
        RemoteController.java로 이동하세요.
     */
}
