package commandPattern;

public class TemperatureUp implements Command{
  private Temperature temperature;

  public TemperatureUp(Temperature temperature) {
    this.temperature = temperature;
  }
  @Override
  public String execute() {
    return temperature.increaseTemperature();
  }
}
