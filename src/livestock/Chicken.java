package livestock;

public class Chicken extends Livestock {
    public Chicken() {
        super("Chicken", 100.0, "Corn, Seeds");
    }

    @Override
    public void feed() {
        System.out.println("Feeding Chicken with corn and seeds.");
    }

    @Override
    public void administerMedication(String medication) {
        System.out.println("Administering " + medication + " to Chicken.");
    }

    @Override
    public void monitorHealth() {
        System.out.println("Health Indicators for Chicken: Weight - 3 kg, Temperature - 41°C, Heart Rate - 120 bpm, Respiratory Rate - 30 bpm, Activity Level - Normal");
    }

    @Override
    public void trackHealthTrends() {
        System.out.println("Health Trends for Chicken: Weight - Stable, Temperature - Stable, Heart Rate - Normal, Respiratory Rate - Stable");
    }
}
