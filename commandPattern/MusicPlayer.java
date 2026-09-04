package commandPattern;

public class MusicPlayer {
  private int volume = 50;

  public String increaseVolume() {
    return "Volume increased to " + volume + "%";
  }
  public String decreaseVolume() {
    return "Volume decreased to " + volume + "%";
  }
}
