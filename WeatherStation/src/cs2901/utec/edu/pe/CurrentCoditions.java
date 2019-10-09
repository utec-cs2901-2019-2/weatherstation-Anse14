package cs2901.utec.edu.pe;

public class CurrentCoditions implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentCoditions(WeatherData _weatherData) {
        weatherData = _weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        temp = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPression();
    }

    @Override
    public void display(){
        System.out.println("La temperatura es " + temp);
        System.out.println("La presion es " + pressure);
        System.out.println("La humedad es " + humidity);

    }
}
