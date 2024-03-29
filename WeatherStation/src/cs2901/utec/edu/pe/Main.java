package cs2901.utec.edu.pe;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCoditions currentCoditions = new CurrentCoditions(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        weatherData.notifyObservers();

        currentCoditions.display();
    }
}
