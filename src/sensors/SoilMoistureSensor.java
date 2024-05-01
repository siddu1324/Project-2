package sensors;

public class SoilMoistureSensor implements Sensor {
    private double moistureLevel;

    @Override
    public double readMoistureLevel() {
        return this.moistureLevel;
    }

    @Override
    public String readWeatherCondition() {
        return null;  // Not applicable for this sensor
    }

    public void setMoistureLevel(double moistureLevel) {
        this.moistureLevel = moistureLevel;
    }
}
