package chapter14_abstraction.interfaces;

public class AirConditionerController {
    // 필드 추가
    private PowerButton powerButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;

    public AirConditionerController(PowerButton powerButton,
                                    TemperatureDownButton temperatureDownButton,
                                    TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTemperatureDown() {
        temperatureDownButton.onPressed();
    }

    public void onDownTemperatureDown() {
        temperatureDownButton.onDown();
    }

    public void onPressedTemperatureUp() {
        temperatureUpButton.onPressed();
    }

    public void onUpTemperatureUp() {
        temperatureUpButton.onUp();
    }
}
