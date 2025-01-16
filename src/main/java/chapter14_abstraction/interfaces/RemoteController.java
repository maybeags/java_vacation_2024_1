package chapter14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언 -> 이전까지는 java 자료형들을 사용했지만 이번에 처음으로
    // 우리가 직접 정의한 클래스가 자료형이 되는 필드를 적용했습니다.
    private PowerButton powerButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;
    // 여기서는 추가한 거 적겠습니다.
    private ChannelDownButton channelDownButton;
    // 필드 추가하세요
    private ChannelUpButton channelUpButton;

    // 매개변수 생성자 중 -> AllArgsConstructor를 정의하세요. -> 필드를 추가할 때마다 AllArgsConstructor가 아니게 되니 수정이 필요합니다.
    public RemoteController(PowerButton powerButton, VolumeDownButton volumeDownButton,
                            VolumeUpButton volumeUpButton, ChannelDownButton channelDownButton,
                            ChannelUpButton channelUpButton) {
        this.powerButton = powerButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        // 필드 추가했습니다.
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
    }

    // 메서드
    // PowerButton의 메서드를 구현
    public void onPressedPowerButton() {
        powerButton.onPressed();        // 필드로 powerButton 객체를 지니고 있기 때문에
}                                       // PowerButton 클래스에서 정의했던 메서드를 호출 가능

    // VolumeDownButton의 메서드를 구현
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    // VolumeUpButton의 메서드들을 구현하세요. - 2개입니다.
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        volumeUpButton.onUp();
    }

    // ChannelDownButton 관련 메서드들 구현
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        channelUpButton.onUp();
    }
    /*
        이까지 작성하시면 Main.java에서 오류 발생합니다 -> 객체 생성 시에 AllArgsConstructor를 만족하지 않기 때문에.
        -Main.java로 이동하세요.
     */
}
