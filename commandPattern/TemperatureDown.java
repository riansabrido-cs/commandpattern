package commandPattern;

public class TemperatureDown implements Command{
  private Temperature temperature;

  public TemperatureDown(Temperature temperature) {
    this.temperature = temperature;
  }
  @Override
  public String execute() {
    return temperature.decreaseTemperature();
  }
}
