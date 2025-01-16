package chapter14_abstraction.interfaces;
/*
    인터페이스는 일반 클래스와 달리 다중 상속이 가능하다고 했습니다.
    그렇기 때문에 일반 클래스와 상속 관련 명령어도 다릅니다
    extends(일반 클래스 상속시) / implements(인터페이스 상속시)
 */
public abstract class Button implements Press, Up, Down {

    @Override
    public void onDown(){};

    @Override
    public abstract void onPressed();

    @Override
    public void onUp(){};
}
/*
    추후 코드 라인들을 확인해보시면,
    PowerButton.java 클래스의 객체는
    onPressed만 사용하고 나머지 onUp, onDown을
    사용하지 않기 때문에
    onUp, onDown 메서드를 implement할 필요가 x
    하지만 abstract로 선언한 메서드는
    자식 클래스에 반드시 구현되어야 하므로
    onUp, onDown을 전부 abstract 선언하면
    PowerButton에 불필요한 method들을
    구현해야하므로 onPressed에만 abstract 선언


 */