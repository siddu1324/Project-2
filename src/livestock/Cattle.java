package livestock;

public class Cattle extends Livestock {
    public Cattle() {
        super("Cattle", 100.0, "Grass, Hay");
    }

    @Override
    public void feed() {
        System.out.println("Feeding Cattle with grass and hay.");
    }

    @Override
    public void administerMedication(String medication) {
        System.out.println("Administering " + medication + " to Cattle.");
    }

    @Override
    public void monitorHealth() {
        System.out.println("Health Indicators for Cattle: Weight - 500 kg, Temperature - 38.5°C, Heart Rate - 80 bpm, Respiratory Rate - 20 bpm, Activity Level - Normal");
    }

    @Override
    public void trackHealthTrends() {
        System.out.println("Health Trends for Cattle: Weight - Stable, Temperature - Increasing, Heart Rate - Normal, Respiratory Rate - Decreasing");
    }
}
