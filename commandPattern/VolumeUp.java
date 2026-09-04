package commandPattern;

public class VolumeUp implements Command{
  private Volume volume;

  public VolumeUp(Volume volume) {
    this.volume = volume;
  }
  @Override
  public String execute() {
    return musicPlayer.increaseVolume();
  }
}
