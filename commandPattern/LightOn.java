package commandPattern;

public class Light implements Command{
  private Light light;

  public LightOn(Light light) {
    this.light = light;
  }
  @Override
  public String execute() {
    return musicPlayer.decreaseVolume();
  }
}
