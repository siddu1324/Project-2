package irrigation;

import resources.ResourceOptimization;
import environment.CarbonFootprint;

public class AdvancedIrrigationStrategy extends IrrigationStrategy {
    private double cropWaterRequirement;
    private static final double DESIRED_MOISTURE_LEVEL = 50.0; // Example: Desired soil moisture level in percentage
    private static final double IRRIGATION_RATE = 1.0; // gallons per minute, as a predefined system specification
    private ResourceOptimization resourceManager;
    private CarbonFootprint carbonManager;

    public AdvancedIrrigationStrategy(double cropWaterRequirement, ResourceOptimization resourceManager, CarbonFootprint carbonManager) {
        this.cropWaterRequirement = cropWaterRequirement;
        this.resourceManager = resourceManager;
        this.carbonManager = carbonManager;
    }

    @Override
    public void determineIrrigationAmount(double moistureLevel, String weatherCondition) {
        // Calculate the water deficit
        double waterDeficit = DESIRED_MOISTURE_LEVEL - moistureLevel;

        // If the water deficit is less than or equal to zero, no irrigation is needed
        if (waterDeficit <= 0) {
            System.out.println("No irrigation needed based on current soil moisture level.");
            return;
        }

        // Calculate the irrigation duration needed to replenish the water deficit
        double irrigationDuration = waterDeficit / IRRIGATION_RATE; // in minutes

        // Assume 3 irrigation sessions per day
        double totalWaterUsage = irrigationDuration * IRRIGATION_RATE * 3; // Total water usage per day
        double energyUsage = 1 * (irrigationDuration / 60) * 3; // Total energy usage per day, assuming 1 kW/h usage

        resourceManager.optimizeWaterUsage(totalWaterUsage);
        resourceManager.optimizeEnergyUsage(energyUsage);
        carbonManager.trackEmissions();

        System.out.printf("Irrigation amount needed: %.2f gallons per session.%n", irrigationDuration * IRRIGATION_RATE);
        System.out.printf("Total daily water usage: %.2f gallons.%n", totalWaterUsage);
        System.out.printf("Total daily energy usage: %.2f kWh.%n", energyUsage);
        scheduleIrrigation(irrigationDuration);
    }

    @Override
    public void scheduleIrrigation(double duration) {
        if (duration > 0) {
            System.out.printf("Irrigation scheduled for %.2f minutes at optimal times based on weather forecast.%n", duration);
        } else {
            System.out.println("No irrigation scheduled due to sufficient moisture levels.");
        }
    }
}
