package crops;

public abstract class Crop {
    protected String name;
    protected String growthStage;
    protected double nutrientRequirements;
    protected boolean isDiseaseSusceptible;

    public Crop(String name, String growthStage, double nutrientRequirements, boolean isDiseaseSusceptible) {
        this.name = name;
        this.growthStage = growthStage;
        this.nutrientRequirements = nutrientRequirements;
        this.isDiseaseSusceptible = isDiseaseSusceptible;
    }

    public abstract void applyFertilizer(double amount);
    public void managePests() {
        if (isDiseaseSusceptible) {
            System.out.println("Applying eco-friendly pesticide to " + name);
        }
    }

    public String displayCropInfo() {
        return "Type: " + name + " - Growth Stage: " + growthStage;
    }
}
