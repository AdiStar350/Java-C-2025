public class Main {
    public static void main(String[] args) {
        // Create a new Car object with default constructor
        Car c1 = new Car();
        
        // Create a new Car object with specified license plate, make year, and engine volume
        Car c2 = new Car("32-262-73", 2012, 1400);

        // Print the details of the first car
        System.out.format("%s, %d, %d\n", c1.getLicensePlate(), c1.getMakeYear(), c1.getEngineVolume());
        
        // Print the details of the second car
        System.out.format("%s, %d, %d\n", c2.getLicensePlate(), c2.getMakeYear(), c2.getEngineVolume());

        // Set new values for the first car's license plate, make year, and engine volume
        c1.setLicensePlate("32-262-73");
        c1.setMakeYear(2024);
        c1.setEngineVolume(1800);

        // Print the updated details of the first car
        System.out.format("%s, %d, %d\n", c1.getLicensePlate(), c1.getMakeYear(), c1.getEngineVolume());
        
        // Check if the license plate of the first car matches with the second car and print the result
        System.out.println(c1.matchLicensePlate(c2));
    }
}
