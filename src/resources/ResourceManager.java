package resources;

public class ResourceManager implements ResourceOptimization {
    @Override
    public void optimizeWaterUsage(double gallons) {
        System.out.println("Optimizing water usage for " + gallons + " gallons per day.");
    }

    @Override
    public void optimizeEnergyUsage(double kWh) {
        System.out.println("Optimizing energy usage for " + kWh + " kWh per day.");
    }
}
