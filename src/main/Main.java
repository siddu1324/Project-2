import crops.Tomato;
import crops.Wheat;
import sensors.SoilMoistureSensor;
import sensors.WeatherSensor;
import decision.SmartDecisionMaker;
import irrigation.AdvancedIrrigationStrategy;
import resources.ResourceManager;
import environment.CarbonManager;
import environment.WasteManagement;
import livestock.Cattle;
import livestock.Chicken;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize all systems and strategies
        SoilMoistureSensor soilSensor = new SoilMoistureSensor();
        WeatherSensor weatherSensor = new WeatherSensor();
        ResourceManager resourceManager = new ResourceManager();
        CarbonManager carbonManager = new CarbonManager();
        WasteManagement wasteManagement = new WasteManagement();
        AdvancedIrrigationStrategy strategy = new AdvancedIrrigationStrategy(30, resourceManager, carbonManager);
        SmartDecisionMaker decisionMaker = new SmartDecisionMaker(soilSensor, weatherSensor, strategy);

        Cattle cattle = new Cattle();
        Chicken chicken = new Chicken();

        Tomato tomato = new Tomato();
        Wheat wheat = new Wheat();

        boolean exit = false;
        while (!exit) {
            System.out.println("Main Menu:");
            System.out.println("1. Enter Sensor Data");
            System.out.println("2. Make Irrigation Decision");
            System.out.println("3. Make Fertilization Decision");
            System.out.println("4. Make Pest Control Decision");
            System.out.println("5. Monitor Cattle Health");
            System.out.println("6. Monitor Chicken Health");
            System.out.println("7. Feed Cattle");
            System.out.println("8. Feed Chicken");
            System.out.println("9. Administer Medication to Livestock");
            System.out.println("10. View Crop Information");
            System.out.println("11. Apply Fertilizer to Crops");
            System.out.println("12. Manage Crop Pests");
            System.out.println("13. View System Health");
            System.out.println("14. Manage Composting");
            System.out.println("15. Recycle Materials");
            System.out.println("16. Manage General Waste");
            System.out.println("17. Exit");
            System.out.print("Select an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter soil moisture level (%):");
                    double moistureLevel = Double.parseDouble(scanner.nextLine());
                    soilSensor.setMoistureLevel(moistureLevel);

                    System.out.println("Enter weather condition (Sunny, Rainy, Cloudy, Windy):");
                    String weatherCondition = scanner.nextLine();
                    weatherSensor.setWeatherCondition(weatherCondition);
                    break;
                case 2:
                    decisionMaker.makeIrrigationDecision();
                    break;
                case 3:
                    decisionMaker.makeFertilizationDecision();
                    break;
                case 4:
                    decisionMaker.makePestControlDecision();
                    break;
                case 5:
                    cattle.monitorHealth();
                    break;
                case 6:
                    chicken.monitorHealth();
                    break;
                case 7:
                    cattle.feed();
                    break;
                case 8:
                    chicken.feed();
                    break;
                case 9:
                    System.out.println("Administering medication to livestock...");
                    cattle.administerMedication("Vaccine, 10 ml");
                    chicken.administerMedication("Vaccine, 5 ml");
                    break;
                case 10:
                    System.out.println("Viewing crop information...");
                    // Assume a method to display crop information
                    break;
                case 11:
                    tomato.applyFertilizer(5);
                    wheat.applyFertilizer(5);
                    break;
                case 12:
                    tomato.managePests();
                    wheat.managePests();
                    break;
                case 13:
                    System.out.println("System Health: All systems operational.");
                    break;
                case 14:
                    wasteManagement.manageComposting();
                    break;
                case 15:
                    wasteManagement.recycleMaterials();
                    break;
                case 16:
                    wasteManagement.manageGeneralWaste();
                    break;
                case 17:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
