package commandPattern;

public class LightOff implements Command{
  private Light light;

  public LightOn(Light light) {
    this.light = light;
  }
  @Override
  public String execute() {
    return light.turnOff();
  }
}
