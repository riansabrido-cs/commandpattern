package commandPattern;

public class ViewerApp {

    public static void main(String[] args){

        RemoteControl rc = new RemoteControl();

        Tv tv = new Tv();
        Command powerOn = new PowerOn(tv);
        rc.setCommand(powerOn);
        rc.clickButton();
        Command powerOff = new PowerOff(tv);
        rc.setCommand(powerOff);
        rc.clickButton();

        Light light = new Light();
        Command lightOn = new LightOn(light);
        rc.setCommand(lightOn);
        rc.clickButton();
        Command lightOff = new LightOff(light);
        rc.setCommand(lightOff);
        rc.clickButton();

        MusicPlayer musicPlayer = new MusicPlayer();
        Command volumeUp = new VolumeUp(musicPlayer);
        rc.setCommand(volumeUp);
        rc.clickButton();
        Command volumeDown = new VolumeDown(musicPlayer);
        rc.setCommand(volumeDown);
        rc.clickButton();

        Thermostat thermostat = new Thermostat();
        Command temperatureUp = new TemperatureUp(thermostat);
        rc.setCommand(temperatureUp);
        rc.clickButton();
        Command temperatureDown = new TemperatureDown(thermostat);
        rc.setCommand(temperatureDown);
        rc.clickButton();

        

        



    }
}
