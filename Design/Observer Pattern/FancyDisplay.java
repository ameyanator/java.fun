public class FancyDisplay implements Observer, Display {
    WeatherData weatherData;

    public FancyDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void register() {
        weatherData.registerObserver(this);
    }

    public void update(int temperature, int humidity, int pressure) {
        display(temperature, humidity, pressure);
    }

    public void display(int temperature, int humidity, int pressure) {
        System.out.println("FancyDisplay with temperature " + temperature + " and humidity " + humidity + " and pressure " + pressure);
    }
}