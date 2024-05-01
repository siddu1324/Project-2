package decision;

import sensors.Sensor;
import irrigation.AdvancedIrrigationStrategy;

public class SmartDecisionMaker implements DecisionMaker {
    private Sensor moistureSensor;
    private Sensor weatherSensor;
    private AdvancedIrrigationStrategy irrigationStrategy;

    public SmartDecisionMaker(Sensor moistureSensor, Sensor weatherSensor, AdvancedIrrigationStrategy irrigationStrategy) {
        this.moistureSensor = moistureSensor;
        this.weatherSensor = weatherSensor;
        this.irrigationStrategy = irrigationStrategy;
    }

    @Override
    public void makeIrrigationDecision() {
        double moistureLevel = moistureSensor.readMoistureLevel();
        String weatherCondition = weatherSensor.readWeatherCondition();
        irrigationStrategy.determineIrrigationAmount(moistureLevel, weatherCondition);
    }

    @Override
    public void makeFertilizationDecision() {
        System.out.println("Decision: Apply fertilizer based on nutrient levels and growth stage.");
    }

    @Override
    public void makePestControlDecision() {
        System.out.println("Decision: Apply pest control measures based on detected pest activity.");
    }
}
