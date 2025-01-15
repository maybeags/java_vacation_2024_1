package chapter14_abstraction.interfaces;
/*
    인터페이스는 일반 클래스와 달리 다중 상속이 가능하다고 했습니다.
    그렇기 때문에 일반 클래스와 상속 관련 명령어도 다릅니다
    extends(일반 클래스 상속시) / implements(인터페이스 상속시)
 */
public abstract class Button implements Press, Up, Down {

    @Override
    public abstract void onDown();

    @Override
    public abstract void onPressed();

    @Override
    public abstract void onUp();
}
