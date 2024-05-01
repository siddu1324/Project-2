package livestock;

public abstract class Livestock {
    protected String species;
    protected double healthStatus;  // Simple representation of overall health
    protected String dietRequirements;

    public Livestock(String species, double healthStatus, String dietRequirements) {
        this.species = species;
        this.healthStatus = healthStatus;
        this.dietRequirements = dietRequirements;
    }

    public abstract void feed();
    public abstract void administerMedication(String medication);
    public abstract void monitorHealth();
    public abstract void trackHealthTrends();
}
