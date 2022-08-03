public class WeatherStation {
    public static void main(String args[]) {
        WeatherData weatherData = new WeatherData();

        FancyDisplay fancyDisplay = new FancyDisplay(weatherData);
        SimpleDisplay simpleDisplay = new SimpleDisplay(weatherData);

        simpleDisplay.register();

        fancyDisplay.register();

        weatherData.setTemperature(1); weatherData.setHumidity(2); weatherData.setPressure(3);

        weatherData.measurementsChanged();
    }
}