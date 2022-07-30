package observer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeatherStationTest {
    
    @Test
    public void weatherDiplayTest() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
