package commandPattern;

public class VolumeDown implements Command{
  private Volume volume;

  public VolumeDown(Volume volume) {
    this.volume = volume;
  }
  @Override
  public String execute() {
    return musicPlayer.decreaseVolume();
  }
}
