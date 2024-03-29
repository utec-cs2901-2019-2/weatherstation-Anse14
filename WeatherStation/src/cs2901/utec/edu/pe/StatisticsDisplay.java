package cs2901.utec.edu.pe;

public class StatisticsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temp;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(WeatherData _weatherData) {
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
        System.out.println("El Promedio es " + Math.random()*10);
        System.out.println("El minimo es " + Math.random()*10);
        System.out.println("El maximo es " + Math.random()*10);

    }
}
