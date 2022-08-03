public class SimpleDisplay implements Observer, Display {
    WeatherData weatherData;

    public SimpleDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void register() {
        weatherData.registerObserver(this);
    }

    public void update(int temperature, int humidity, int pressure) {
        display(temperature, humidity, pressure);
    }

    public void display(int temperature, int humidity, int pressure) {
        System.out.println("SimpleDisplay with temperature " + temperature + " and humidity " + humidity + " and pressure " + pressure);
    }
}