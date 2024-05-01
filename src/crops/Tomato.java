package crops;

public class Tomato extends Crop {
    public Tomato() {
        super("Tomato", "Flowering", 2.0, false);
    }

    @Override
    public void applyFertilizer(double amount) {
        System.out.println("Applying " + amount + "kg of Potassium-rich fertilizer to Tomato.");
    }
}
