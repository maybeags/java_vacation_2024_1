package chapter14_abstraction.interfaces;

public class VolumeUpButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("음량을 한 칸 올립니다.");
    }

    @Override
    public void onUp() {
        System.out.println("음량을 계속 올립니다.");
    }
}
/*
    VolumeDownButton에 동일한 방식으로 메서드를 정의하시오.
 */