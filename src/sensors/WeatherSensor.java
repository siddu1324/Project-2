package sensors;

public class WeatherSensor implements Sensor {
    private String weatherCondition;

    @Override
    public double readMoistureLevel() {
        return 0;  // Not applicable for this sensor
    }

    @Override
    public String readWeatherCondition() {
        return this.weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }
}
