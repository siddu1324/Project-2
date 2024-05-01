package irrigation;

public abstract class IrrigationStrategy {
    public abstract void determineIrrigationAmount(double moistureLevel, String weatherCondition);
    public abstract void scheduleIrrigation(double duration); // Modified to take a duration parameter
}
