package environment;

public class CarbonManager implements CarbonFootprint {
    @Override
    public void trackEmissions() {
        System.out.println("Tracking carbon emissions from farm operations.");
    }

    @Override
    public void reduceEmissions() {
        System.out.println("Implementing strategies to reduce carbon emissions.");
    }
}
