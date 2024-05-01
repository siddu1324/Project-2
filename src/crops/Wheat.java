package crops;

public class Wheat extends Crop {
    public Wheat() {
        super("Wheat", "Seedling", 1.5, true);
    }

    @Override
    public void applyFertilizer(double amount) {
        System.out.println("Applying " + amount + "kg of Nitrogen-based fertilizer to Wheat.");
    }
}
